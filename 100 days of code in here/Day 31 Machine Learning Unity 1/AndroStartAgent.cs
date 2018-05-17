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
public class AndroStartAgent : Agent
{
	//show current number
	[SerializeField]
	private float currentNumber;
	//show target number
	[SerializeField]
	private float targetNumber;
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
		AddVectorObs (currentNumber);
		AddVectorObs (targetNumber);

		//return state;
	}
	/*
	public override List<float> CollectState()
	{
		List<float> state = new List<float>();
		state.Add(currentNumber);
		state.Add(targetNumber);
		return state;
	}
	*/

	//this is a series of sets, like an update for the agent

	public override void AgentAction (float[] vectorAction, string textAction)
	{	
		
		if (text != null) 
		{
			text.text = string.Format ("C:{0} / T:{1} [{2}]", 
				currentNumber, targetNumber, solved);
		}
		//each arry index is a possible action
		switch((int)vectorAction[0])
		{
		case 0://decrease
			currentNumber -= 0.01f;
			break;
		case 1://increase
			currentNumber += 0.01f;
			break;
		default:
			return;
			//nothing yet added to throw exceptions do later
		}
		cube.position = new Vector3 (currentNumber * 5f, 0f, 0f);

		//check for fail condition
		if (currentNumber < -1.1f || currentNumber > 1.1f) 
		{
			//total failure
			AddReward(-1f);
			//AddReward = -1f;//or is it reward ? Version difference
			Done();
			return;//bail out
		}

		//returns difference as a positive value
		float difference = Mathf.Abs (targetNumber - currentNumber);
		//if close enough increase reward by 1
		if (difference <= 0.01f) {
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
		targetNumber = UnityEngine.Random.Range (-1f, 1f);
		sphere.position = new Vector3 (targetNumber * 5f, 0f, 0f);
		//reset current number to 0
		currentNumber = 0f;
	} 



}
