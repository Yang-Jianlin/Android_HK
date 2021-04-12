package com.hcnetsdk.jna;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;

public interface HCNetSDKByJNA extends Library {

	// command begin
	public static final int NET_DVR_GET_TIMECFG = 118;
	public static final int NET_DVR_SET_TIMECFG = 119;
	
	public static final int NET_DVR_GET_CARD_CFG = 2116;
	
	public static final int NET_DVR_GET_ALARMHOSTSUBSYSTEM_CFG = 2001;
	public static final int NET_DVR_SET_ALARMHOSTSUBSYSTEM_CFG = 2002;
	
	public static final int NET_DVR_GET_ALARMHOST_OTHER_STATUS_V50 = 2228;

	public static final int NET_DVR_GET_MULTI_STREAM_COMPRESSIONCFG = 3216;
	public static final int NET_DVR_SET_MULTI_STREAM_COMPRESSIONCFG = 3217;

	public static final int NET_DVR_START_GET_INPUTVOLUME = 3370;

	public static final int NET_DVR_GET_LOITERING_DETECTION = 3521;
	public static final int NET_DVR_SET_LOITERING_DETECTION = 3522;
	
	public static final int NET_DVR_GET_LED_AREA_INFO_LIST = 9295;
	
	public static final int NET_DVR_MATRIX_GETWINSTATUS = 9009;
	// command end
	
	//alarm type
	public static final int COMM_ALARM_RULE = 0x1102;
	public static final int COMM_ALARM_V30 = 0x4000;
	public static final int COMM_ALARM_V40 = 0x4007;
	public static final int COMM_UPLOAD_PLATE_RESULT = 0x2800;
	public static final int COMM_ITS_PLATE_RESULT = 0x3050;
	//alarm type end

	public static final int NET_DVR_DEV_ADDRESS_MAX_LEN = 129;
	public static final int NET_DVR_LOGIN_USERNAME_MAX_LEN = 64;
	public static final int NET_DVR_LOGIN_PASSWD_MAX_LEN = 64;
	public static final int NET_SDK_CALLBACK_TYPE_STATUS = 0;
	public static final int NET_SDK_CALLBACK_TYPE_PROGRESS = 1;
	public static final int NET_SDK_CALLBACK_TYPE_DATA = 2;

	public static final int ACS_CARD_NO_LEN = 32;
	public static final int CARD_PASSWORD_LEN = 8;
	public static final int MAX_DOOR_NUM = 32;
	public static final int MAX_CARD_RIGHT_PLAN_NUM = 4;

	public static final int STREAM_ID_LEN = 32;
	public static final int SERIALNO_LEN = 48;
	public static final int NAME_LEN = 32;
	public static final int MACADDR_LEN = 6;
	public static final int MAX_DISKNUM_V30 = 33;
	public static final int MAX_DISKNUM = 16;
	public static final int MAX_LICENSE_LEN = 16;

	public static final int MAX_CHANNUM = 16;
	public static final int MAX_ALARMIN = 16;
	public static final int MAX_ALARMOUT = 4;

	public static final int MAX_ANALOG_CHANNUM = 32;
	public static final int MAX_ANALOG_ALARMOUT = 32;
	public static final int MAX_ANALOG_ALARMIN = 32;
	public static final int MAX_IP_DEVICE = 32;
	public static final int MAX_IP_CHANNEL = 32;
	public static final int MAX_IP_ALARMIN = 128;
	public static final int MAX_IP_ALARMOUT = 64;

	public static final int MAX_CHANNUM_V30 = (MAX_ANALOG_CHANNUM + MAX_IP_CHANNEL);// 64
	public static final int MAX_ALARMOUT_V30 = (MAX_ANALOG_ALARMOUT + MAX_IP_ALARMOUT);// 96
	public static final int MAX_ALARMIN_V30 = (MAX_ANALOG_ALARMIN + MAX_IP_ALARMIN);// 160

	public static final int VCA_MAX_POLYGON_POINT_NUM = 10;
	public static final int MAX_REGION_NUM = 8;
	public static final int MAX_NUM_OUTPUT_CHANNEL = 512;
	
	public static final int ALARMHOST_MAX_SIREN_NUM = 8;
	public static final int MAX_DETECTOR_NUM = 128;
	public static final int ENUM_VCA_EVENT_TRAVERSE_PLANE      		= 1;
	public static final int ENUM_VCA_EVENT_ENTER_AREA         		= 2;
	public static final int ENUM_VCA_EVENT_EXIT_AREA           		= 3;
	public static final int ENUM_VCA_EVENT_INTRUSION      			= 4;
	public static final int ENUM_VCA_EVENT_LOITER     				= 5;
	public static final int ENUM_VCA_EVENT_LEFT_TAKE           		= 6;
	public static final int ENUM_VCA_EVENT_PARKING             		= 7;
	public static final int ENUM_VCA_EVENT_RUN            			= 8;
	public static final int ENUM_VCA_EVENT_HIGH_DENSITY        		= 9;
	public static final int ENUM_VCA_EVENT_VIOLENT_MOTION      		= 10;
	public static final int ENUM_VCA_EVENT_REACH_HIGHT         		= 11;
	public static final int ENUM_VCA_EVENT_GET_UP              		= 12;
	public static final int ENUM_VCA_EVENT_LEFT                		= 13;
	public static final int ENUM_VCA_EVENT_TAKE                		= 14;
	public static final int ENUM_VCA_EVENT_LEAVE_POSITION      		= 15;
	public static final int ENUM_VCA_EVENT_TRAIL               		= 16;
	public static final int ENUM_VCA_EVENT_KEY_PERSON_GET_UP   		= 17;
	public static final int ENUM_VCA_EVENT_STANDUP             		= 18;
	public static final int ENUM_VCA_EVENT_FALL_DOWN                = 20;
	public static final int ENUM_VCA_EVENT_AUDIO_ABNORMAL      		= 21;
	public static final int ENUM_VCA_EVENT_ADV_REACH_HEIGHT    		= 22;
	public static final int ENUM_VCA_EVENT_TOILET_TARRY        		= 23;
	public static final int ENUM_VCA_EVENT_YARD_TARRY          		= 24;
	public static final int ENUM_VCA_EVENT_ADV_TRAVERSE_PLANE  		= 25;
	public static final int ENUM_VCA_EVENT_HUMAN_ENTER         		= 29;
	public static final int ENUM_VCA_EVENT_OVER_TIME           		= 30;
	public static final int ENUM_VCA_EVENT_STICK_UP            		= 31;
	public static final int ENUM_VCA_EVENT_INSTALL_SCANNER     		= 32;
	public static final int ENUM_VCA_EVENT_PEOPLENUM_CHANGE    		= 35;
	public static final int ENUM_VCA_EVENT_SPACING_CHANGE      		= 36;
	public static final int ENUM_VCA_EVENT_COMBINED_RULE       		= 37;
	public static final int ENUM_VCA_EVENT_SIT_QUIETLY         		= 38;
	public static final int ENUM_VCA_EVENT_HIGH_DENSITY_STATUS 		= 39;

	
	public static final int MAX_SUBSYSTEM_ID_LEN = 16;
	public static final int ACCOUNTNUM_LEN = 6;
	public static final int ACCOUNTNUM_LEN_32 = 32;
	
	
    public static final int EZVIZ_DEVICEID_LEN = 32;
	public static final int EZVIZ_REQURL_LEN = 64;
	public static final int EZVIZ_ACCESSTOKEN_LEN = 128;
	public static final int EZVIZ_CLIENTTYPE_LEN = 32;
	public static final int EZVIZ_FEATURECODE_LEN = 64;
	public static final int EZVIZ_OSVERSION_LEN = 32;
	public static final int EZVIZ_NETTYPE_LEN = 32;
	public static final int EZVIZ_SDKVERSION_LEN = 32;
	public static final int EZVIZ_APPID_LEN = 64;
	
	
	
	public static class NET_DVR_TIME_V30 extends Structure{
		public short	wYear;
		public byte		byMonth;
		public byte		byDay;
		public byte		byHour;
		public byte		byMinute;
		public byte		bySecond;
		public byte		byRes;
		public short    wMilliSec;
		public byte[]	byRes1 = new byte[2];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("wYear", "byMonth", "byDay", "byHour","byMinute", "bySecond","byRes", "wMilliSec", "byRes1");
		}
	}

	public static class NET_DVR_IPADDR extends Structure {
		public byte[] sIpV4 = new byte[16];
		public byte[] byRes = new byte[128];

		public String toString() {
			return "NET_DVR_IPADDR.sIpV4: " + new String(sIpV4) + "\n"
					+ "NET_DVR_IPADDR.byRes: " + new String(byRes) + "\n";
		}
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("sIpV4", "byRes");
		}
	}
	
	public static class NET_VCA_POINT extends Structure{
		 public  float  fX;
		 public float  fY;
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("fX", "fY");
		}
	}
	
	public static class NET_VCA_LINE extends Structure{
		 public NET_VCA_POINT   struStart = new NET_VCA_POINT();
		 public NET_VCA_POINT   struEnd = new NET_VCA_POINT();
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struStart", "struEnd");
		}
	}

	public static class NET_VCA_POLYGON extends Structure {

		public int dwPointNum;
		public NET_VCA_POINT[] struPos = (NET_VCA_POINT[]) new NET_VCA_POINT().toArray(10);
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwPointNum", "struPos");
		}
	}

	public static class NET_DVR_STD_CONFIG extends Structure {
		public Pointer lpCondBuffer;
		public int dwCondSize;
		public Pointer lpInBuffer;
		public int dwInSize;
		public Pointer lpOutBuffer;
		public int dwOutSize;
		public Pointer lpStatusBuffer;
		public int dwStatusSize;
		public Pointer lpXmlBuffer;
		public int dwXmlSize;
		public byte byDataType;
		public byte[] byRes = new byte[23];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("lpCondBuffer", "dwCondSize",
					"lpInBuffer", "dwInSize", "lpOutBuffer", "dwOutSize",
					"lpStatusBuffer", "dwStatusSize", "lpXmlBuffer",
					"dwXmlSize", "byDataType", "byRes");
		}
	}

	public static class NET_DVR_STD_ABILITY extends Structure {
		public Pointer lpCondBuffer;
		public int dwCondSize;
		public Pointer lpOutBuffer;
		public int dwOutSize;
		public Pointer lpStatusBuffer;
		public int dwStatusSize;
		public int dwRetSize;
		public byte[] byRes = new byte[32];
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("lpCondBuffer", "dwCondSize",
					"lpOutBuffer", "dwOutSize", "lpStatusBuffer",
					"dwStatusSize", "dwRetSize", "byRes");
		}
	}

	public static class NET_VCA_RECT extends Structure {
		public float fX;
		public float fY;
		public float fWidth;
		public float fHeight;
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays
					.asList("fX", "fY", "fWidth", "fHeight");
		}
	}

	public static class NET_DVR_ALARMINFO extends Structure {
		public int dwAlarmType;
		public int dwAlarmInputNumber;
		public int[] dwAlarmOutputNumber = new int[MAX_ALARMOUT];
		public int[] dwAlarmRelateChannel = new int[MAX_CHANNUM];
		public int[] dwChannel = new int[MAX_CHANNUM];
		public int[] dwDiskNumber = new int[MAX_DISKNUM];
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmType",
					"dwAlarmInputNumber", "dwAlarmOutputNumber",
					"dwAlarmRelateChannel", "dwChannel", "dwDiskNumber");
		}
	}

	public static class NET_DVR_TIME extends Structure {
		public int dwYear;
		public int dwMonth;
		public int dwDay;
		public int dwHour;
		public int dwMinute;
		public int dwSecond;
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwYear", "dwMonth", "dwDay",
					"dwHour", "dwMinute", "dwSecond");
		}
	}
	
	public static class NET_DVR_XML_CONFIG_INPUT extends Structure
	{
		public int 		dwSize;
		public Pointer	lpRequestUrl;
		public int		dwRequestUrlLen;
		public Pointer	lpInBuffer;
		public int		dwInBufferSize;
		public int		dwRecvTimeOut;
		public byte[]	byRes = new byte[32];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "lpRequestUrl", "dwRequestUrlLen", "lpInBuffer", "dwInBufferSize", 
					"dwRecvTimeOut", "byRes");
		}		
	}

	public static class NET_DVR_XML_CONFIG_OUTPUT extends Structure {
		public int dwSize;
		public Pointer lpOutBuffer;
		public int dwOutBufferSize;
		public int dwReturnedXMLSize;
		public Pointer lpStatusBuffer;
		public int dwStatusSize;
		public byte[] byRes = new byte[32];
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "lpOutBuffer",
					"dwOutBufferSize", "dwReturnedXMLSize", "lpStatusBuffer",
					"dwStatusSize", "byRes");
		}
	}

	public static class NET_DVR_CALL_ROOM_CFG extends Structure {
		public int dwSize;
		public short nFloorNumber;
		public short wRoomNumber;
		public byte byManageCenter;
		public byte[] byRes = new byte[127];
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "nFloorNumber", "wRoomNumber", "byManageCenter", "byRes");
		}
	}

	public static class NET_DVR_ALARMER extends Structure {
		public byte byUserIDValid;
		public byte bySerialValid;
		public byte byVersionValid;
		public byte byDeviceNameValid;
		public byte byMacAddrValid;
		public byte byLinkPortValid;
		public byte byDeviceIPValid;
		public byte bySocketIPValid;
		public int lUserID;
		public byte[] sSerialNumber = new byte[SERIALNO_LEN];
		public int dwDeviceVersion;
		public byte[] sDeviceName = new byte[NAME_LEN];
		public byte[] byMacAddr = new byte[MACADDR_LEN];
		public short wLinkPort;
		public byte[] sDeviceIP = new byte[128];
		public byte[] sSocketIP = new byte[128];
		public byte byIpProtocol;
		public byte[] byRes2 = new byte[11];
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byUserIDValid",
					"bySerialValid", "byVersionValid", "byDeviceNameValid",
					"byMacAddrValid", "byLinkPortValid", "byDeviceIPValid",
					"bySocketIPValid", "lUserID", "sSerialNumber",
					"dwDeviceVersion", "sDeviceName", "byMacAddr", "wLinkPort",
					"sDeviceIP", "sSocketIP", "byIpProtocol", "byRes2");
		}
	}

	public static class NET_DVR_ALARMINFO_V30 extends Structure {
		public int dwAlarmType;
		public int dwAlarmInputNumber;
		public byte[] byAlarmOutputNumber = new byte[MAX_ALARMOUT_V30];
		public byte[] byAlarmRelateChannel = new byte[MAX_CHANNUM_V30];
		public byte[] byChannel = new byte[MAX_CHANNUM_V30];
		public byte[] byDiskNumber = new byte[MAX_DISKNUM_V30];

		public NET_DVR_ALARMINFO_V30(Pointer p) {
			super(p);
		}
		@Override
		protected List getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmType",
					"dwAlarmInputNumber", "byAlarmOutputNumber",
					"byAlarmRelateChannel", "byChannel", "byDiskNumber");
		}
	}
	
	public static class struIOAlarm extends Structure{
		public int dwAlarmInputNo;
		public int dwTrigerAlarmOutNum;
		public int dwTrigerRecordChanNum;
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmInputNo","dwTrigerAlarmOutNum", "dwTrigerRecordChanNum");
		}
	}
	
	public static class NET_DVR_TIME_EX extends Structure{
		public short wYear;
		public byte byMonth;
		public byte byDay;
		public byte byHour;
		public byte byMinute;
		public byte bySecond;
		public byte byRes;
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("wYear","byMonth", "byDay", "byHour","byMinute", "bySecond", "byRes");
		}
	}

	public static class NET_VCA_DEV_INFO extends Structure{
		public NET_DVR_IPADDR struDevIP = new NET_DVR_IPADDR();
		public short wPort;
		public byte byChannel;
		public byte byIvmsChannel;
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struDevIP", "wPort", "byChannel", "byIvmsChannel");
		}
	}
	
	public static class  struRecordingHost extends Structure{
		public byte bySubAlarmType;
		public byte[] byRes1 = new byte[3];
		public NET_DVR_TIME_EX struRecordEndTime = new NET_DVR_TIME_EX();
		public byte[] byRes = new byte[116];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("bySubAlarmType", "byRes1", "struRecordEndTime", "byRes");
		}
	}

	public static class struAlarmHardDisk extends Structure{
		public int dwAlarmHardDiskNum;

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmHardDiskNum");
		}
	}

	public static class struAlarmChannel extends Structure{
		public int dwAlarmChanNum;

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmChanNum");
		}
	}
	
	public static class uStruAlarm extends Union
	{
			public byte[] byUnionLen = new byte[128];
			public struIOAlarm struioAlarm = new struIOAlarm();
			public struAlarmHardDisk strualarmHardDisk = new struAlarmHardDisk();
			public struAlarmChannel sstrualarmChannel = new struAlarmChannel();		
			public struRecordingHost strurecordingHost = new struRecordingHost();      
	}
	
	public static class NET_DVR_ALRAM_FIXED_HEADER extends Structure{
		 public int                       dwAlarmType;
		 public NET_DVR_TIME_EX             struAlarmTime = new NET_DVR_TIME_EX();
		 public uStruAlarm ustruAlarm = new uStruAlarm();
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwAlarmType", "struAlarmTime", "ustruAlarm");
		}
	}
	
	public static class NET_DVR_ALARMINFO_V40 extends Structure {
		public NET_DVR_ALRAM_FIXED_HEADER struAlarmFixedHeader = new NET_DVR_ALRAM_FIXED_HEADER();
		public Pointer pAlarmData;
		public NET_DVR_ALARMINFO_V40(Pointer p){
			super(p);
		}
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struAlarmFixedHeader", "pAlarmData");
		}
	}
	
	public static class NET_DVR_PLATE_INFO extends Structure{
		public byte byPlateType;
		public byte byColor;
		public byte byBright;
		public byte byLicenseLen;
		public byte byEntireBelieve;
		public byte byRegion;
		public byte byCountry;
		public byte[] byRes = new byte[33];
		public NET_VCA_RECT struPlateRect = new NET_VCA_RECT();
		public byte[] sLicense = new byte[MAX_LICENSE_LEN];
		public byte[] byBelieve = new byte[MAX_LICENSE_LEN];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byPlateType", "byColor", "byBright", "byLicenseLen", "byEntireBelieve", "byRegion",
					"byCountry", "byRes", "struPlateRect", "sLicense", "byBelieve");
		}

	}

	public static class NET_DVR_VEHICLE_INFO extends Structure{
		public int dwIndex;
		public byte byVehicleType;
		public byte byColorDepth;
		public byte byColor;
		public byte byRes1;
		public short wSpeed;
		public short wLength;
		public byte byIllegalType;
		public byte byVehicleLogoRecog;
		public byte byVehicleSubLogoRecog;
		public byte byVehicleModel;
		public byte[] byCustomInfo = new byte[16];
		public short wVehicleLogoRecog;
		public byte[] byRes3 = new byte[14];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwIndex", "byVehicleType", "byColorDepth", "byColor", "byRes1", "wSpeed",
					"wLength", "byIllegalType", "byVehicleLogoRecog", "byVehicleSubLogoRecog", "byVehicleModel",
					"byCustomInfo", "wVehicleLogoRecog", "byRes3");
		}
	}

	public static class NET_DVR_PLATE_RESULT extends Structure{
		public int dwSize;
		public byte byResultType;
		public byte byChanIndex;
		public short wAlarmRecordID;
		public int dwRelativeTime;
		public byte[] byAbsTime = new byte[32];
		public int dwPicLen;
		public int dwPicPlateLen;
		public int dwVideoLen;
		public byte byTrafficLight;
		public byte byPicNum;
		public byte byDriveChan;
		public byte byVehicleType;
		public int dwBinPicLen;
		public int dwCarPicLen;
		public int dwFarCarPicLen;
		public ByteByReference pBuffer3;
		public ByteByReference pBuffer4;
		public ByteByReference pBuffer5;
		public byte byRelaLaneDirectionType;
		public byte[] byRes3 = new byte[7];
		public NET_DVR_PLATE_INFO struPlateInfo = new NET_DVR_PLATE_INFO();
		public NET_DVR_VEHICLE_INFO struVehicleInfo = new NET_DVR_VEHICLE_INFO();
		public ByteByReference pBuffer1;
		public ByteByReference pBuffer2;
		
		public NET_DVR_PLATE_RESULT(Pointer p){
			super(p);
		}
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "byResultType", "byChanIndex", "wAlarmRecordID", "dwRelativeTime", "byAbsTime",
					"dwPicLen", "dwPicPlateLen", "dwVideoLen", "byTrafficLight", "byPicNum", "byDriveChan", "byVehicleType",
					"dwBinPicLen", "dwCarPicLen", "dwFarCarPicLen", "pBuffer3", "pBuffer4", "pBuffer5", "byRelaLaneDirectionType",
					"byRes3", "struPlateInfo", "struVehicleInfo", "pBuffer1", "pBuffer2");
		}
	}

	public static class NET_ITS_PICTURE_INFO extends Structure{
		public int           dwDataLen;
		public byte          byType;
		public byte		     byDataType;
		public byte          byCloseUpType;
		public byte          byPicRecogMode;
		public int           dwRedLightTime;
		public byte[]        byAbsTime = new byte[32];
		public NET_VCA_RECT  struPlateRect;
		public NET_VCA_RECT  struPlateRecgRect;
		public ByteByReference      pBuffer;
		public int           dwUTCTime;
		public byte          byCompatibleAblity;
		public byte[]        byRes2 = new byte[7];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwDataLen", "byType", "byDataType", "byCloseUpType", "byPicRecogMode", "dwRedLightTime",
					"byAbsTime", "struPlateRect", "struPlateRecgRect", "pBuffer", "dwUTCTime", "byCompatibleAblity", "byRes2");
		}
	}
	
	public static class NET_ITS_PLATE_RESULT extends Structure{
		public int				   dwSize;
		public int      		   dwMatchNo;
		public byte				   byGroupNum;
		public byte                byPicNo;
		public byte                bySecondCam;
		public byte                byFeaturePicNo;
		public byte                byDriveChan;
		public byte                byVehicleType;
		public byte                byDetSceneID;
		public byte                byVehicleAttribute;
		public short               wIllegalType;
		public byte[]              byIllegalSubType = new byte[8];
		public byte                byPostPicNo;
		public byte                byChanIndex;
		public short               wSpeedLimit;
		public byte[]              byRes2 = new byte[2];
		public NET_DVR_PLATE_INFO  struPlateInfo = new NET_DVR_PLATE_INFO();
		public NET_DVR_VEHICLE_INFO     struVehicleInfo = new NET_DVR_VEHICLE_INFO();
		public byte[]              byMonitoringSiteID = new byte[48];
		public byte[]              byDeviceID = new byte[48];
		public byte                byDir;
		public byte                byDetectType;
		public byte                byRelaLaneDirectionType;
		public byte                byRes3;
		public int                 dwCustomIllegalType;
		public byte                byIllegalFromatType;
		public ByteByReference     pIllegalInfoBuf;
		public byte[]              byRes4 = new byte[4];
		public byte                byDataAnalysis;
		public byte                byYellowLabelCar;
		public byte                byDangerousVehicles;
		public byte                byPilotSafebelt;
		public byte                byCopilotSafebelt;
		public byte                byPilotSunVisor;
		public byte                byCopilotSunVisor;
		public byte                byPilotCall;
		public byte                byBarrierGateCtrlType;
		public byte                byAlarmDataType;
		public NET_DVR_TIME_V30    struSnapFirstPicTime = new NET_DVR_TIME_V30();
		public int                 dwIllegalTime;
		public int                 dwPicNum;
		public NET_ITS_PICTURE_INFO[]     struPicInfo = (NET_ITS_PICTURE_INFO[])new NET_ITS_PICTURE_INFO().toArray(6);
		
		public NET_ITS_PLATE_RESULT(Pointer p){
			super(p);
		}
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwMatchNo", "byGroupNum", "byPicNo", "bySecondCam", "byFeaturePicNo","byDriveChan",
					"byVehicleType", "byDetSceneID", "byVehicleAttribute", "wIllegalType", "byIllegalSubType", "byPostPicNo", 
					"byChanIndex", "wSpeedLimit", "byRes2", "struPlateInfo", "struVehicleInfo", "byMonitoringSiteID", "byDeviceID", 
					"byDir", "byDetectType", "byRelaLaneDirectionType", "byRes3", "dwCustomIllegalType", "byIllegalFromatType",
					"pIllegalInfoBuf", "byRes4", "byDataAnalysis", "byYellowLabelCar", "byDangerousVehicles", "byPilotSafebelt",
					"byCopilotSafebelt", "byPilotSunVisor", "byCopilotSunVisor", "byPilotCall", "byBarrierGateCtrlType", "byAlarmDataType",
					"struSnapFirstPicTime", "dwIllegalTime", "dwPicNum", "struPicInfo");
		}
	}
	
	public static class NET_VCA_TARGET_INFO extends Structure {
		public int          dwID;
		public NET_VCA_RECT struRect = new NET_VCA_RECT();
		public byte[]       byRes = new byte[4];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwID", "struRect", "byRes");
		}

	}
	
	public static class NET_VCA_TRAVERSE_PLANE extends Structure {
		public NET_VCA_LINE    struPlaneBottom = new NET_VCA_LINE();
		public int             dwCrossDirection;
		public byte            bySensitivity;
		public byte            byPlaneHeight;
		public byte            byDetectionTarget;
		public byte[]          byRes2 = new byte[37];
		
		public NET_VCA_TRAVERSE_PLANE(Pointer pointer){
			super(pointer);
		}
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struPlaneBottom", "dwCrossDirection", "bySensitivity", "byPlaneHeight", "byDetectionTarget", "byRes2");
		}
	}
	
	public static class NET_VCA_AREA extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public byte               byDetectionTarget;
		public byte[]             byRes = new byte[7];		
		
		public NET_VCA_AREA(Pointer pointer) {
			// TODO Auto-generated constructor stub
			super(pointer);
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "byDetectionTarget", "byRes");
		}
	}
	
	public static class NET_VCA_INTRUSION extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public short              wDuration;
		public byte               bySensitivity;
		public byte               byRate;
		public byte               byDetectionTarget;
		public byte[]             byRes = new byte[3];
		
		public NET_VCA_INTRUSION(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byRate", "byDetectionTarget", "byRes");
		}
	}

	public static class NET_VCA_LOITER extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public short              wDuration;
		public byte[]             byRes = new byte[6];
		
		
		public NET_VCA_LOITER(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}


		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "byRes");
		}
	}

	public static class NET_VCA_TAKE_LEFT extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public short              wDuration;
		public byte[]             byRes = new byte[6];
		
		
		public NET_VCA_TAKE_LEFT(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}


		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_PARKING extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public short              wDuration;
		public byte[]             byRes = new byte[6];
		
		public NET_VCA_PARKING(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_RUN extends Structure {
		public NET_VCA_POLYGON    struRegion = new NET_VCA_POLYGON();
		public float              fRunDistance;
		public byte               bySensitivity;
		public byte               byMode;
		public byte               byDetectionTarget;
		public byte               byRes;
		
		public NET_VCA_RUN(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "fRunDistance", "bySensitivity", "byMode", "byDetectionTarget", "byRes");
		}
	}
	
	public static class NET_VCA_HIGH_DENSITY extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public float             fDensity;
		public byte              bySensitivity;
		public byte              byRes;
		public short             wDuration;
		
		public NET_VCA_HIGH_DENSITY(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "fDensity", "bySensitivity", "byRes", "wDuration");
		}
	}
	
	public static class NET_VCA_VIOLENT_MOTION extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte              bySensitivity;
		public byte              byMode;
		public byte[]            byRes = new byte[4];
		
		public NET_VCA_VIOLENT_MOTION(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byMode", "byRes");
		}
	}
	
	public static class NET_VCA_REACH_HIGHT extends Structure {
		public NET_VCA_LINE     struVcaLine = new NET_VCA_LINE();
		public short            wDuration;
		public byte[]           byRes = new byte[6];
		
		public NET_VCA_REACH_HIGHT(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struVcaLine", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_GET_UP extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte              byMode;
		public byte              bySensitivity;
		public byte[]            byRes = new byte[4];
		
		public NET_VCA_GET_UP(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "byMode", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_LEFT extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte              bySensitivity;
		public byte[]            byRes = new byte[5];
		
		public NET_VCA_LEFT(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byRes");
		}
	}

	public static class NET_VCA_TAKE extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte              bySensitivity;
		public byte[]            byRes = new byte[5];
		
		public NET_VCA_TAKE(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byRes");
		}
	}

	public static class NET_VCA_HUMAN_ENTER extends Structure {
		public int[]            dwRes = new int[23];
		
		public NET_VCA_HUMAN_ENTER(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwRes");
		}
	}

	public static class NET_VCA_OVER_TIME extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte[]            byRes = new byte[6];
		
		public NET_VCA_OVER_TIME(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_STICK_UP extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte				 bySensitivity;
		public byte[]            byRes = new byte[5];
		
		public NET_VCA_STICK_UP(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_SCANNER extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte				 bySensitivity;
		public byte[]            byRes = new byte[5];
		
		public NET_VCA_SCANNER(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_LEAVE_POSITION extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wLeaveDelay;
		public short             wStaticDelay;
		public byte              byMode;
		public byte              byPersonType;
		public byte[]            byRes = new byte[2];
		
		public NET_VCA_LEAVE_POSITION(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wLeaveDelay", "wStaticDelay", "byMode", "byPersonType", "byRes");
		}
	}
	
	public static class NET_VCA_TRAIL extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wRes;
		public byte				 bySensitivity;
		public byte[]            byRes = new byte[5];
		
		public NET_VCA_TRAIL(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wRes", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_FALL_DOWN extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short             wDuration;
		public byte				 bySensitivity;
		public byte				 byHeightThreshold;
		public byte[]            byRes = new byte[4];
		
		public NET_VCA_FALL_DOWN(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDuration", "bySensitivity", "byHeightThreshold", "byRes");
		}
	}
	
	public static class NET_VCA_AUDIO_ABNORMAL extends Structure {
		public short    wDecibel;
		public byte     bySensitivity;
		public byte     byAudioMode;
		public byte     byEnable;
		public byte     byThreshold;
		public byte[]   byRes = new byte[54];
		
		public NET_VCA_AUDIO_ABNORMAL(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("wDecibel", "bySensitivity", "byAudioMode", "byEnable", "byThreshold", "byRes");
		}
	}

	public static class NET_VCA_ADV_REACH_HEIGHT extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public int				 dwCrossDirection;
		public byte[]            byRes = new byte[4];
		
		public NET_VCA_ADV_REACH_HEIGHT(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "dwCrossDirection", "byRes");
		}
	}
	
	public static class NET_VCA_TOILET_TARRY extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short			 wDelay;
		public byte[]            byRes = new byte[6];
		
		public NET_VCA_TOILET_TARRY(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDelay", "byRes");
		}
	}
	
	public static class NET_VCA_YARD_TARRY extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public short			 wDelay;
		public byte[]            byRes = new byte[6];
		
		public NET_VCA_YARD_TARRY(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "wDelay", "byRes");
		}
	}
	
	public static class NET_VCA_ADV_TRAVERSE_PLANE extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public int               dwCrossDirection;
		public byte              bySensitivity;
		public byte[]            byRes = new byte[3];
		
		public NET_VCA_ADV_TRAVERSE_PLANE(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "dwCrossDirection", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_STANDUP extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public byte              bySensitivity;
		public byte              byHeightThreshold;
		public short             wDuration;
		public byte[]            byRes = new byte[4];
		
		public NET_VCA_STANDUP(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "bySensitivity", "byHeightThreshold", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_PEOPLENUM_CHANGE extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public byte              bySensitivity;
		public byte              byPeopleNumThreshold;
		public byte              byDetectMode;
		public byte              byNoneStateEffective;
		public short             wDuration;
		public byte[]            byRes = new byte[2];
		
		public NET_VCA_PEOPLENUM_CHANGE(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "bySensitivity", "byPeopleNumThreshold", "byDetectMode", "byNoneStateEffective", "wDuration", "byRes");
		}
	}
	
	public static class NET_VCA_SPACING_CHANGE extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public float             fSpacingThreshold;
		public byte              bySensitivity;
		public byte              byDetectMode;
		public short             wDuration;
		
		public NET_VCA_SPACING_CHANGE(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "fSpacingThreshold", "bySensitivity", "byDetectMode", "wDuration");
		}
	}
	
	public static class NET_VCA_RELATE_RULE_PARAM extends Structure {
		public byte    byRuleID;
		public byte    byRes;
		public short   wEventType;
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byRuleID", "byRes", "wEventType");
		}
	}
	
	public static class NET_VCA_COMBINED_RULE extends Structure {
		public byte                     byRuleSequence;
		public byte[]                   byRes = new byte[7];
		public int                      dwMinInterval;
		public int                      dwMaxInterval;
		public NET_VCA_RELATE_RULE_PARAM     struRule1Raram = new NET_VCA_RELATE_RULE_PARAM();
		public NET_VCA_RELATE_RULE_PARAM     struRule2Raram = new NET_VCA_RELATE_RULE_PARAM();
		public byte[]                   byRes1 = new byte[36];
		
		public NET_VCA_COMBINED_RULE(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byRuleSequence", "byRes", "dwMinInterval", "dwMaxInterval", "struRule1Raram", "struRule2Raram", "byRes1");
		}
	}
	
	public static class NET_VCA_SIT_QUIETLY extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public int               dwDuration;
		public byte[]			 byRes = new byte[4];
		
		public NET_VCA_SIT_QUIETLY(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "dwDuration", "byRes");
		}
	}
	
	public static class NET_VCA_HIGH_DENSITY_STATUS extends Structure {
		public NET_VCA_POLYGON   struRegion = new NET_VCA_POLYGON();
		public float             fDensity;
		public byte              bySensitivity;
		public byte[]            byRes = new byte[3];
		
		public NET_VCA_HIGH_DENSITY_STATUS(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "fDensity", "bySensitivity", "byRes");
		}
	}
	
	public static class NET_VCA_EVENT_UNION extends Union
	{
		public int[] uLen = new int[23];
		//not list all the event structure,it's too slow,see COMM_ALARM_RULE in JNATest��java 
	}
	
	public static class NET_VCA_RULE_INFO extends Structure {
		public byte             byRuleID;
		public byte             byRes;
		public short            wEventTypeEx;
		public byte[]           byRuleName = new byte[NAME_LEN];
		public int              dwEventType;
		public NET_VCA_EVENT_UNION   uEventParam = new NET_VCA_EVENT_UNION();
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byRuleID", "byRes", "wEventTypeEx", "byRuleName", "dwEventType", "uEventParam");
		}
	}
	
	public static class NET_VCA_RULE_ALARM extends Structure {
		public int              dwSize;
		public int              dwRelativeTime;
		public int              dwAbsTime;
		public NET_VCA_RULE_INFO     struRuleInfo = new NET_VCA_RULE_INFO();
		public NET_VCA_TARGET_INFO   struTargetInfo = new NET_VCA_TARGET_INFO();
		public NET_VCA_DEV_INFO      struDevInfo = new NET_VCA_DEV_INFO();
		public int              dwPicDataLen;
		public byte             byPicType;
		public byte             byRelAlarmPicNum;
		public byte             bySmart;
		public byte             byRes;
		public int              dwAlarmID;
		public byte[]           byRes2 = new byte[8];
		public ByteByReference  pImage;
		
		public NET_VCA_RULE_ALARM(Pointer p){
			super(p);
		}
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwRelativeTime", "dwAbsTime", "struRuleInfo", "struTargetInfo", "struDevInfo",
					"dwPicDataLen", "byPicType", "byRelAlarmPicNum", "bySmart", "byRes", "dwAlarmID", "byRes2", "pImage");
		}
	}
	
	public static class NET_DVR_STREAM_INFO extends Structure {
		public int dwSize;
		public byte[] byID = new byte[STREAM_ID_LEN];
		public int dwChannel;
		public byte[] byRes = new byte[32];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "byID", "dwChannel",
					"byRes");
		}
	}

	public static class NET_DVR_MULTI_STREAM_COMPRESSIONCFG_COND extends
			Structure {
		public int dwSize;
		public NET_DVR_STREAM_INFO struStreamInfo = new NET_DVR_STREAM_INFO();
		public int dwStreamType;
		public byte byRes[] = new byte[32];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "struStreamInfo",
					"dwStreamType", "byRes");
		}
	}

	public static class NET_DVR_COMPRESSION_INFO_V30 extends Structure {
		public byte byStreamType;
		public byte byResolution;
		public byte byBitrateType;
		public byte byPicQuality;
		public int dwVideoBitrate;
		public int dwVideoFrameRate;
		public short wIntervalFrameI;
		public byte byIntervalBPFrame;
		public byte byENumber;
		public byte byVideoEncType;
		public byte byAudioEncType;
		public byte[] byres = new byte[10];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byStreamType", "byResolution",
					"byBitrateType", "byPicQuality", "dwVideoBitrate",
					"dwVideoFrameRate", "wIntervalFrameI", "byIntervalBPFrame",
					"byENumber", "byVideoEncType", "byAudioEncType", "byres");
		}
	}

	public static class NET_DVR_MULTI_STREAM_COMPRESSIONCFG extends Structure {
		public int dwSize;
		public int dwStreamType;
		public NET_DVR_COMPRESSION_INFO_V30 struStreamPara = new NET_DVR_COMPRESSION_INFO_V30();
		public byte[] byRes = new byte[80];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwStreamType",
					"struStreamPara", "byRes");
		}
	}

	public static class INT_ARRAY extends Structure {
		public int[] iValue;

		public INT_ARRAY(int iLen) {
			iValue = new int[iLen];
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("iValue");
		}
	}

	public static class BYTE_ARRAY extends Structure {
		public byte[] byValue;

		public BYTE_ARRAY(int iLen) {
			byValue = new byte[iLen];
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byValue");
		}
	}

	public static class NET_DVR_LOITERING_REGION extends Structure {
		public NET_VCA_POLYGON struRegion = new NET_VCA_POLYGON();
		public byte bySensitivity;
		public byte byTimeThreshold;
		public byte[] byRes = new byte[62];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struRegion", "bySensitivity",
					"byTimeThreshold", "byRes");
		}
	}

	public static class NET_DVR_LOITERING_DETECTION extends Structure {
		public int dwSize;
		public byte byEnabled;
		public byte[] byRes1 = new byte[3];
		public NET_DVR_LOITERING_REGION[] struRegion = (NET_DVR_LOITERING_REGION[]) new NET_DVR_LOITERING_REGION()
				.toArray(MAX_REGION_NUM);
		public byte[] byRes2 = new byte[128];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "byEnabled",
					"byRes1", "struRegion", "byRes2");
		}
	}

	public static class NET_DVR_SMART_REGION_COND extends Structure {
		public int dwSize;
		public int dwChannel;
		public int dwRegion;

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwChannel",
					"dwRegion");
		}
	}

	public static class NET_DVR_INPUTVOLUME extends Structure {
		public int dwSize;
		public byte byAudioInputChan;
		public byte[] byRes = new byte[63];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "byAudioInputChan",
					"byRes");
		}
	}

	public static class NET_DVR_CARD_CFG_COND extends Structure {
		public int dwSize;
		public int dwCardNum;
		public byte byCheckCardNo;
		public byte[] byRes = new byte[31];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwCardNum",
					"byCheckCardNo", "byRes");
		}
	}

	public static class NET_DVR_VALID_PERIOD_CFG extends Structure {
		public byte byEnable;
		public byte[] byRes1 = new byte[3];
		public NET_DVR_TIME_EX struBeginTime = new NET_DVR_TIME_EX();
		public NET_DVR_TIME_EX struEndTime = new NET_DVR_TIME_EX();
		public byte[] byRes2 = new byte[32];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byEnable", "byRes1",
					"struBeginTime", "struEndTime", "byRes2");
		}
	}

	public static class arrayCardRightPlan extends Structure {
		public byte[] byDoorRightPlan = new byte[MAX_CARD_RIGHT_PLAN_NUM];

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("byDoorRightPlan");
		}
	}

	public static class NET_DVR_CARD_CFG extends Structure {
		public int dwSize;
		public int dwModifyParamType;
		public byte[] byCardNo = new byte[ACS_CARD_NO_LEN];
		public byte byCardValid;
		public byte byCardType;
		public byte byLeaderCard;
		public byte byRes1;
		public int dwDoorRight;
		public NET_DVR_VALID_PERIOD_CFG struValid = new NET_DVR_VALID_PERIOD_CFG();
		public int dwBelongGroup;
		public byte[] byCardPassword = new byte[CARD_PASSWORD_LEN];
		public arrayCardRightPlan[] byCardRightPlan = new arrayCardRightPlan[MAX_DOOR_NUM];
		public int dwMaxSwipeTime;
		public int dwSwipeTime;
		public short wRoomNumber;
		public short wFloorNumber;
		public byte[] byRes2 = new byte[20];

		public NET_DVR_CARD_CFG(Pointer p) {
			super(p);
		}

		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize", "dwModifyParamType",
					"byCardNo", "byCardValid", "byCardType", "byLeaderCard",
					"byRes1", "dwDoorRight", "struValid", "dwBelongGroup",
					"byCardPassword", "byCardRightPlan", "dwMaxSwipeTime",
					"dwSwipeTime", "wRoomNumber", "wFloorNumber", "byRes2");
		}
	}
	
	public static class NET_DVR_LED_AREA_COND extends Structure
	{
	    public int dwSize;
	    public int dwVideoWallNo; 
	    public int dwLEDAreaNo;
	    public byte[] byRes = new byte[32];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","dwVideoWallNo",
					"dwLEDAreaNo","byRes");
		}
	}
	
	public static class NET_DVR_RECTCFG_EX extends Structure
	{
		public int  dwXCoordinate;
		public int  dwYCoordinate; 
		public int  dwWidth;       
		public int  dwHeight;     
		public byte [] byRes= new byte[4];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwXCoordinate","dwYCoordinate",
					"dwWidth","dwHeight","byRes");
		}
	}

	public static class NET_DVR_LED_AREA_INFO extends Structure
	{
		public int dwSize;
		public int dwLEDAreaNo; 
	    public NET_DVR_RECTCFG_EX struRect = new NET_DVR_RECTCFG_EX(); 
	    public int []dwaOutputNo= new int[MAX_NUM_OUTPUT_CHANNEL]; 
	    public byte [] byRes= new byte[32];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","dwLEDAreaNo","struRect",
					"dwaOutputNo","byRes");
		}
	}
	
	public static class NET_DVR_LED_AREA_INFO_LIST extends Structure
	{
		public int dwSize;
		public int dwLEDAreaNum;
	    public Pointer lpstruBuffer;
	    public int dwBufferSize;
	    public byte [] byRes= new byte[32];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","dwLEDAreaNum","lpstruBuffer",
					"dwBufferSize","byRes");
		}
	}
	
	public static class NET_DVR_MATRIX_PASSIVEMODE extends Structure
	{
		public short	wTransProtol;
		public short	wPassivePort;
		public NET_DVR_IPADDR	struMcastIP = new NET_DVR_IPADDR(); 
		public byte	    byStreamType;
		public byte[]	byRes= new byte[7];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("wTransProtol","wPassivePort",
				"struMcastIP","byStreamType","byRes");
		}
	}
	
	public static class NET_DVR_ALARMHOST_OTHER_STATUS_V50 extends Structure
	{
		public int dwSize;
		public byte[]	bySirenStatus = new byte[ALARMHOST_MAX_SIREN_NUM];
		public byte[]	byDetetorPower = new byte[MAX_DETECTOR_NUM];
		public byte[]	byDetetorConnection = new byte[MAX_DETECTOR_NUM];
		public byte[]	byRes= new byte[1024];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","bySirenStatus","byDetetorPower","byDetetorConnection","byRes");
		}
	}
	
	public static class NET_DVR_NOAMAL_SUB_SYSTEM extends Structure
	{
		public int 		dwBeJoinedSubSystem;
		public byte[]	byRes= new byte[16];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwBeJoinedSubSystem","byRes");
		}
	}
	
	public static class NET_DVR_PUBLIC_SUB_SYSTEM extends Structure
	{
		public int 		dwJointSubSystem;
		public byte[]	byRes= new byte[16];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwJointSubSystem","byRes");
		}
	}
	
	public static class NET_DVR_JOINT_SUB_SYSTEM extends Union
	{
		public NET_DVR_NOAMAL_SUB_SYSTEM	struNormalSubSystem = new NET_DVR_NOAMAL_SUB_SYSTEM();
		public NET_DVR_PUBLIC_SUB_SYSTEM	struPublicSubSystem = new NET_DVR_PUBLIC_SUB_SYSTEM();
		public byte[]	byRes= new byte[20];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("struNormalSubSystem","struPublicSubSystem","byRes");
		}
	}
	
	public static class NET_DVR_ALARMSUBSYSTEMPARAM extends Structure
	{
		public int		dwSize;
		public short	wEnterDelay;
		public short	wExitDelay;
		public byte	    byHostageReport;
		public byte	    bySubsystemEnable;
		public byte	    byKeyToneOfArmOrDisarm;
		public byte	    byKeyToneOfManualTestReport;
		public short	wDelayTime;
		public byte	    byEnableAlarmInDelay;
		public byte	    byPublicAttributeEnable;
		public NET_DVR_JOINT_SUB_SYSTEM	struJointSubSystem = new NET_DVR_JOINT_SUB_SYSTEM();
		public byte	    byKeyZoneArm;
		public byte	    byKeyZoneArmReport;
		public byte	    byKeyZoneDisarm;
		public byte	    byKeyZoneDisarmReport;
		public byte[]	bySubSystemID = new byte[MAX_SUBSYSTEM_ID_LEN];
		public byte	    byKeyZoneArmReportEnable;
		public byte	    byKeyZoneArmEnable;
		public byte	    byOneKeySetupAlarmEnable;
		public byte	    bySingleZoneSetupAlarmEnable;
		public byte	    byCenterType;
		public byte[]	sCenterAccount = new byte[ACCOUNTNUM_LEN];
		public byte[]	sCenterAccountV40 = new byte[ACCOUNTNUM_LEN_32];
		public byte[]	byRes2 = new byte[565];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","wEnterDelay","wExitDelay","byHostageReport","bySubsystemEnable"
					,"byKeyToneOfArmOrDisarm","byKeyToneOfManualTestReport","wDelayTime","byEnableAlarmInDelay","byPublicAttributeEnable"
					,"struJointSubSystem","byKeyZoneArm","byKeyZoneArmReport","byKeyZoneDisarm","byKeyZoneDisarmReport"
					,"bySubSystemID","byKeyZoneArmReportEnable","byKeyZoneArmEnable","byOneKeySetupAlarmEnable","bySingleZoneSetupAlarmEnable"
					,"byCenterType","sCenterAccount","sCenterAccountV40","byRes2");
		}
	}

	public static class NET_DVR_WALLWIN_INFO extends Structure
	{
		public int 		dwSize;
		public int		dwWinNum;
		public int		dwSubWinNum;
		public int		dwWallNo;
		public byte[]	byRes = new byte[12];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","dwWinNum","dwSubWinNum","dwWallNo","byRes");
		}
	}
	
	public static class NET_DVR_WALL_WIN_STATUS extends Structure
	{
		public int 		dwSize;
		public byte 	byDecodeStatus;
		public byte 	byStreamType;
		public byte 	byPacketType;
		public byte 	byFpsDecV;
		public byte 	byFpsDecA;
		public byte[] 	byRes1 = new byte[7];
		public int 		dwDecodedV;
		public int 		dwDecodedA;
		public short 	wImgW;
		public short 	wImgH;
		public byte 	byStreamMode; 
		public byte[] 	byRes2 = new byte[31];
		@Override
		protected List<String> getFieldOrder() {
			// TODO Auto-generated method stub
			return Arrays.asList("dwSize","byDecodeStatus","byStreamType","byPacketType","byFpsDecV",
					"byFpsDecA","byRes1","dwDecodedV","dwDecodedA","wImgW",
					"wImgH","byStreamMode","byRes2");
		}
	}
	public static class NET_DVR_SETUPALARM_PARAM extends Structure
	{
		public int		dwSize;
		public byte		byLevel;
		public byte		byAlarmInfoType;
		public byte 	byRetAlarmTypeV40;
		public byte 	byRetDevInfoVersion;
		public byte 	byRetVQDAlarmType;
		public byte 	byFaceAlarmDetection;
		public byte 	bySupport;
		public byte 	byBrokenNetHttp;
		public short	wTaskNo;
		public byte[]   byRes1 = new byte[6];
		
		protected List<String>	getFieldOrder(){
			return Arrays.asList("dwSize", "byLevel", "byAlarmInfoType",
					"byRetAlarmTypeV40", "byRetDevInfoVersion", "byRetVQDAlarmType",
					"byFaceAlarmDetection", "bySupport", "byBrokenNetHttp", "wTaskNo", "byRes1");
		}
	}

	public static class NET_DVR_DEVICEINFO_V30 extends Structure
	{
	   public  byte[] 	sSerialNumber = new byte[SERIALNO_LEN];  
	   public  byte 	byAlarmInPortNum;		        
	   public  byte 	byAlarmOutPortNum;		        
	   public  byte 	byDiskNum;				   
	   public  byte 	byDVRType;				   
	   public  byte 	byChanNum;				   
	   public  byte 	byStartChan;			   
	   public  byte 	byAudioChanNum;            
	   public  byte 	byIPChanNum;				
	   public  byte[] 	byRes1 = new byte[24];
	   @Override
	   protected List<String> getFieldOrder() {
		   // TODO Auto-generated method stub
		   return Arrays.asList("sSerialNumber", "byAlarmInPortNum", "byAlarmOutPortNum",
				   "byDiskNum", "byDVRType", "byChanNum", "byStartChan", "byAudioChanNum", "byIPChanNum", "byRes1");
	   }	
	}
	
	public static class NET_DVR_DEVICEINFO_V40 extends Structure
	{
			public NET_DVR_DEVICEINFO_V30 struDeviceV30;
			public byte bySupportLock;
			public byte byRetryLoginTime;
			public byte byPasswordLevel;
			public byte byRes1;
			public int  dwSurplusLockTime;
			public byte byCharEncodeType;
			public byte[] byRes2 = new byte[255];
			@Override
			protected List<String> getFieldOrder() {
				// TODO Auto-generated method stub
				return Arrays.asList("struDeviceV30", "bySupportLock", "byRetryLoginTime",
						   "byPasswordLevel", "byRes1", "dwSurplusLockTime", "byCharEncodeType", "byRes2");
			}
	}

	
	public static class NET_DVR_USER_LOGIN_INFO extends Structure
	{
			public byte[] sDeviceAddress = new byte[NET_DVR_DEV_ADDRESS_MAX_LEN];
			public byte byRes1;
			public short wPort;
			public byte[] sUserName = new byte[NET_DVR_LOGIN_USERNAME_MAX_LEN];
			public byte[] sPassword = new byte[NET_DVR_LOGIN_PASSWD_MAX_LEN];
			public FLoginResultCallBack cbLoginResult;
			public Pointer pUser;
			public boolean bUseAsynLogin;
			public byte[] byRes2 = new byte[128];
			@Override
			protected List<String> getFieldOrder() {
				// TODO Auto-generated method stub
				return Arrays.asList("sDeviceAddress", "byRes1", "wPort", "sUserName", "sPassword", 
						"cbLoginResult", "pUser", "bUseAsynLogin", "byRes2");
			}
	}
	
	
	public static class NET_DVR_OPEN_EZVIZ_USER_LOGIN_INFO extends Structure
	{
			public byte[] sEzvizServerAddress = new byte[NET_DVR_DEV_ADDRESS_MAX_LEN];
			public byte[] byRes1 = new byte[3];
			public short wPort;
			public byte[] byRes2 = new byte[2];
			public byte[] sUrl = new byte[EZVIZ_REQURL_LEN];
			public byte[] sAccessToken = new byte[EZVIZ_ACCESSTOKEN_LEN];
			public byte[] sDeviceID = new byte[EZVIZ_DEVICEID_LEN];
			public byte[] sClientType = new byte[EZVIZ_CLIENTTYPE_LEN];
			public byte[] sFeatureCode = new byte[EZVIZ_FEATURECODE_LEN];
			public byte[] sOsVersion = new byte[EZVIZ_OSVERSION_LEN];
			public byte[] sNetType = new byte[EZVIZ_NETTYPE_LEN];
			public byte[] sSdkVersion = new byte[EZVIZ_SDKVERSION_LEN];
			public byte[] sAppID = new byte[EZVIZ_APPID_LEN];
			public byte[] byRes3 = new byte[128];
			@Override
			protected List<String> getFieldOrder() {
				// TODO Auto-generated method stub
				return Arrays.asList("sEzvizServerAddress", "byRes1", "wPort", "byRes2", "sUrl", 
						"sAccessToken", "sDeviceID", "sClientType", "sFeatureCode",
						"sOsVersion", "sNetType", "sSdkVersion", "sAppID", "byRes3");
			}
	}

	int NET_DVR_GetSDKVersion();
	int NET_DVR_GetLastError();
	int NET_DVR_Login_V40(Pointer pLoginInfo, Pointer lpDevice);
	boolean NET_DVR_Logout(int lUserID);
	boolean NET_DVR_STDXMLConfig(int lUserID, NET_DVR_XML_CONFIG_INPUT lpInputParam, NET_DVR_XML_CONFIG_OUTPUT lpOutputParam);
	boolean NET_DVR_GetDVRConfig(int lUserID, int dwCommand, int lChannel, Pointer lpOutBuffer, int dwOutBufferSize, IntByReference lpBytesReturned);
	boolean NET_DVR_SetDVRConfig(int lUserID, int dwCommand, int lChannel, Pointer lpInBuffer, int dwInBufferSize);
	boolean NET_DVR_GetDeviceConfig(int lUserID, int dwCommand, int dwCount, Pointer lpInBuffer, int dwInBufferSize, Pointer lpStatusList, Pointer lpOutBuffer, int dwOutBuggerSize);
	boolean NET_DVR_SetDeviceConfig(int lUserID, int dwCommand, int dwCount, Pointer lpInBuffer, int dwInBufferSize, Pointer lpStatusList, Pointer lpInParamBuffer, int dwInParamBufferSize);
	boolean NET_DVR_GetSTDConfig(int lUserID, int dwCommand, Pointer lpConfigParam);
	boolean NET_DVR_SetSTDConfig(int lUserID, int dwCommand, Pointer lpConfigParam);
	boolean NET_DVR_GetSTDAbility(int lUserID, int dwAbilityType, Pointer lpAbilityParam);
	boolean NET_DVR_SetDVRMessageCallBack_V30(FMSGCallBack fMessageCallBack, Pointer pUser);
	boolean NET_DVR_SetDVRMessageCallBack_V50(int iIndex, FMSGCallBack fMessageCallBack, Pointer pUser);
	int NET_DVR_SetupAlarmChan_V30(int lUserID);
	int NET_DVR_SetupAlarmChan_V41(int lUserID, Pointer lpSetupParam);
	boolean NET_DVR_CloseAlarmChan_V30(int lAlarmHandle);
	int NET_DVR_StartRemoteConfig(int lUserID, int dwCommand, Pointer lpInBuffer, int dwInBufferLen, fRemoteConfigCallback cbStateCallback, Pointer pUserData);
	boolean NET_DVR_StopRemoteConfig(int lHandle);
	int NET_DVR_MatrixStartPassiveDecode(int lUserID, int dwDecChanNum, Pointer lpPassiveMode);
	boolean NET_DVR_MatrixSendData(int lPassiveHandle, Pointer pSendBuf, int dwBufSize);
	boolean NET_DVR_MatrixStopPassiveDecode(int lPassiveHandle);
	int NET_DVR_MatrixGetPassiveDecodeStatus(int lPassiveHandle);
	
	int NET_DVR_CreateOpenEzvizUser(Pointer pLoginInfo, Pointer pDeviceInfo);
	//int NET_DVR_CreateOpenEzvizUser(NET_DVR_OPEN_EZVIZ_USER_LOGIN_INFO pLoginInfo, NET_DVR_DEVICEINFO_V40 pDeviceInfo);
	boolean NET_DVR_DeleteOpenEzvizUser(int iUserID);
	
	public interface FMSGCallBack extends Callback {
		public void invoke(int lCommand, NET_DVR_ALARMER pAlarmer,
                           Pointer pAlarmInfo, int dwBufLen, Pointer pUser);
	}

	public interface fRemoteConfigCallback extends Callback {
		public void invoke(int dwType, Pointer lpBuffer, int dwBufLen,
                           Pointer pUserData);
	}
	
	public interface FLoginResultCallBack extends Callback{
    	public int invoke(int lUserID, int dwResult, NET_DVR_DEVICEINFO_V30 lpDeviceinfo, Pointer pUser);
    }
}