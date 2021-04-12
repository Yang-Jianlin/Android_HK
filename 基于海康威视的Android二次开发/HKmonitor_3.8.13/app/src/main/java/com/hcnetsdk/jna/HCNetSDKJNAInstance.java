package com.hcnetsdk.jna;

import com.sun.jna.Native;

public enum HCNetSDKJNAInstance 
{	
	CLASS;
	private static HCNetSDKByJNA netSdk = null;
	/**
	 * get the instance of HCNetSDK
	 * @return the instance of HCNetSDK
	 */
	public static HCNetSDKByJNA getInstance()
	{
		if (null == netSdk)
		{
			synchronized (HCNetSDKByJNA.class)
			{
				netSdk = (HCNetSDKByJNA) Native.loadLibrary("hcnetsdk",
						HCNetSDKByJNA.class);
			}			
		}
		return netSdk;
	}
}