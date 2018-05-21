using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SphereAgent : Agent 
{

	public GameObject floor;
	public float strength = 20;
	Rigidbody rb;

	public override void InitializeAgent()
	{
		//GetComponent<FloorPhysics>().
		//ball.GetComponent<BallPhysics>().force *= 0.5f;
		rb = GetComponent<Rigidbody>();
		//print ("Floor has started");
	}

	public override void CollectObservations()
	{
		AddVectorObs (transform.position);
		AddVectorObs (floor.transform.eulerAngles.x );
		AddVectorObs (floor.transform.eulerAngles.z);

	}

	public override void AgentAction(float[] vectorAction, string textAction)
	{
		SetReward(0.025f);
		//AddReward(0.025f);
		rb.AddTorque (new Vector3 (vectorAction [0]*strength,0f,0f) , ForceMode.Acceleration);
		rb.AddTorque (new Vector3 (0f,0f,vectorAction [1]*strength) , ForceMode.Acceleration);

		if (transform.position.y < -3.0f) 
		{
			SetReward (-2.0f);
			Done ();
		}
	}

	public override void AgentReset()
	{
		transform.position = new Vector3(Random.Range(-2f,2f ),1.25f,Random.Range(-2f,2f ));
		transform.eulerAngles = Vector3.zero;
		rb.velocity = Vector3.zero;
		rb.angularVelocity = Vector3.zero;
	}
}
