using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BallPhysics : MonoBehaviour 
{
	Rigidbody rb;
	Vector3 startPosition;

	// Use this for initialization
	void Start () 
	{
		rb = GetComponent<Rigidbody>();
		//grab position from unity at the start
		startPosition = transform.position;


	}
	
	// Update is called once per frame
	void FixedUpdate () 
	{
		/*
		//get key inputs to apply torque
		if (Input.GetKey (KeyCode.RightArrow))
			rb.AddTorque (Vector3.back, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.LeftArrow))
			rb.AddTorque (Vector3.forward, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.UpArrow))
			rb.AddTorque (Vector3.right, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.DownArrow))
			rb.AddTorque (Vector3.left, ForceMode.VelocityChange);
		if (Input.GetKey (KeyCode.Space))
			rb.AddForce (Vector3.up*2f, ForceMode.VelocityChange);	

		//if ball falls reset position and physics
		if (transform.position.y < -5f) 
		{
			transform.position = startPosition;
			transform.eulerAngles = Vector3.zero;
			rb.velocity = Vector3.zero;
			rb.angularVelocity = Vector3.zero;
		}
		*/
	}
}
