using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FloorAgent : Agent 
{
	
	public GameObject ball;//get ball//dont forget to attach it in the ui public field
	public float strength = 10;
	Rigidbody rb;

	public override void InitializeAgent()
	{
		//GetComponent<FloorPhysics>().
		//ball.GetComponent<BallPhysics>().force *= 0.5f;
		rb = GetComponent<Rigidbody>();
		print ("Floor has started");
	}
	public override void CollectObservations()
	{
		AddVectorObs (ball.transform.position);
		AddVectorObs (transform.eulerAngles.x );
		AddVectorObs (transform.eulerAngles.z);
	}

	public override void AgentAction(float[] vectorAction, string textAction)
	{
		/*
		if (Input.GetKey (KeyCode.D))
			rb.AddTorque (Vector3.back*0.25f, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.A))
			rb.AddTorque (Vector3.forward*0.25f, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.W))
			rb.AddTorque (Vector3.right*0.25f, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.S))
			rb.AddTorque (Vector3.left*0.25f, ForceMode.VelocityChange);
		*/
		SetReward (-0.025f);
		//AddReward (-0.025f);
		//print("Floor reward is " +  GetReward() ) ;
		rb.AddTorque (vectorAction [0]*strength,0f,0f,ForceMode.Acceleration);
		rb.AddTorque (0f, 0f, vectorAction [1]*strength,ForceMode.Acceleration);

		if (ball.transform.position.y < -3.0f) 
		{
			SetReward (1.0f);
			Done ();
		}
	}

	public override void AgentReset()
	{
		transform.eulerAngles = Vector3.zero;
		rb.angularVelocity = Vector3.zero;
	}
}
