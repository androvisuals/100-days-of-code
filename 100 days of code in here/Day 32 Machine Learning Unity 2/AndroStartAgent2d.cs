using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

/*
 * to control this with keys put 
 * vector action
 * 		Space type > Discrete
 * 
 * I think for training it needs to be set to continious
 * pay attention to the amount of max steps for the agent
 * 0 means it can take forever, 100 is the minimum
 * 300 seems like a good number, gonna test it now
 * 
 * */
public class AndroStartAgent2d : Agent
{
	//show current number
	[SerializeField]
	//private float currentNumber;
	private Vector3 currentNumber;

	//show target number
	[SerializeField]
	private Vector3 targetNumber;
	//init text field object
	[SerializeField]
	private Text text;

	//used to visualize the agent and target
	[SerializeField]
	private Transform cube;
	[SerializeField]
	private Transform sphere;

	int solved;
	List<float> state = new List<float>();
	public override void CollectObservations ()
	{

		//state.Add (currentNumber);
		//state.Add (targetNumber);
		//now vec2
		AddVectorObs (currentNumber);
		AddVectorObs (targetNumber);

	}

	//this is a series of sets, like an update for the agent

	public override void AgentAction (float[] vectorAction, string textAction)
	{	

		if (text != null) 
		{
			text.text = string.Format ("C:{0} / T:{1} [{2}]", 
				currentNumber, targetNumber, solved);
		}
		//each arry index is a possible action//keys in
		switch((int)vectorAction[0])
		{
		case 0://decrease left - key q
			currentNumber.x -= 0.01f;
			break;
		case 1://increase right - key d
			currentNumber.x += 0.01f;
			break;
		case 2://increase right - key w
			currentNumber.z += 0.01f;
			break;
		case 3://increase right - key s
			currentNumber.z -= 0.01f;
			break;
		case 4://increase right - key s
			currentNumber.y -= 0.01f;
			break;
		case 5://increase right - key s
			currentNumber.y += 0.01f;
			break;
		default:
			return;
			//nothing yet added to throw exceptions do later
		}
		//move the cube
		cube.position = new Vector3 (currentNumber.x * 5f, currentNumber.y *5f, currentNumber.z *5f);

		//check for fail condition
		if (currentNumber.x < -1.1f || currentNumber.y < -1.1f || currentNumber.z < -1.1f ||
			currentNumber.x > 1.1f || currentNumber.y > 1.1f || currentNumber.z > 1.1f   ) 
		{
			//total failure
			AddReward(-1f);
			//AddReward = -1f;//or is it reward ? Version difference
			Done();
			return;//bail out
		}
		//so we have current number and target number
		//delta is 
		//returns difference as a positive value
		//needs to have a difference in 3d space here as difference
		float difference = Mathf.Abs (Vector3.Distance( targetNumber , currentNumber) );
		//have to figure out a way to have a number comparsion
		//if the distance is increasing punish,
		//if the distance is decreasing reward
		//if close enough increase reward by 1
		if (difference <= 0.1f) {
			solved++;
			AddReward (1.0f);
			Done ();
			return;
		} 
		else 
		{
			//punish agent for taking too long
			AddReward (-0.001f);
		}

	}

	//how to pick the target number
	//this happens after each completion
	public override void AgentReset ()
	{
		//pick a random number for target
		targetNumber = new Vector3(UnityEngine.Random.Range (-0.25f, 0.25f),
			UnityEngine.Random.Range (-0.25f, 0.25f),UnityEngine.Random.Range (-0.25f, 0.25f));
		sphere.position = new Vector3 (targetNumber.x * 5f, targetNumber.y*5f, targetNumber.z*5f);
		//reset current number to 0
		currentNumber = new Vector3( 0f ,0f,0f) ;
	} 



}
