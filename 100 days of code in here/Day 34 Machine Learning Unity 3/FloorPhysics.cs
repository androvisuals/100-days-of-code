using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FloorPhysics : MonoBehaviour 
{
	Rigidbody rb;
	public float clampRotation = 70.0f;
	// Use this for initialization
	void Start () 
	{
		rb = GetComponent<Rigidbody>();
		rb.angularDrag = 10;
		rb.mass = 1000000;
	}
	
	// Update is called once per frame
	void FixedUpdate () 
	{
		Vector3 eulerAngles = transform.eulerAngles;
		if (eulerAngles.x > 180) 
		{
			eulerAngles.x = eulerAngles.x - 360;
		}
		if (eulerAngles.z > 180) 
		{
			eulerAngles.z = eulerAngles.z - 360;
		}
		eulerAngles.x = Mathf.Clamp (eulerAngles.x, -clampRotation, clampRotation);
		eulerAngles.z = Mathf.Clamp (eulerAngles.z, -clampRotation, clampRotation);
		transform.eulerAngles = new Vector3(eulerAngles.x, 0f,eulerAngles.z);
		//get key inputs to apply torque
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

	}
}
