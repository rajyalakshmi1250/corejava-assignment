package main;
public class Telivision
{
	private boolean stateOfTelivison =false;
	public final int maxChannel = 100;
    	public final int minChannel = 1;
    	public final int maxVolume  = 10;
    	public final int minVolume  = 1;
	private int volumeCurrent=4;
	private int channelCuurrent=8;
	public boolean setStateOfTelivison(boolean stateOfTelivison)
	{
		this.stateOfTelivison = stateOfTelivison;
		if(stateOfTelivison)
		{
			return stateOfTelivison = true;
		}
		else
		{
			return stateOfTelivison = false;
		}
	}
	public int volumeOfTelivison()
	{
		return volumeCurrent;
	}
	public int channelOfTelivision()
	{
		return channelCuurrent;
	}
	public int volumeIncreaseOfTelivision()
	{
		return (volumeCurrent+1) ;
	}
	public int volumeDecreaseOfTelivision()
	{
		return (volumeCurrent-1) ;
	}
	public int channelIncreaseOfTelivision()
	{
		return (channelCuurrent+1) ;
	}
	public int channelDecreaseOfTelivision()
	{
		return (channelCuurrent-1);
	}
}