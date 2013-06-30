package cn.chdany._3d_images;

import android.app.Application;

public class _3dApp extends Application {
	
	public static final int IMAGE_TOTAL_COUNT = 110;
	
	public int[] _IDS = new int[IMAGE_TOTAL_COUNT];
	public String[] _NAMES;
	
	@Override
	public void onCreate() {
		super.onCreate();
		readIds();
		readNames();
	}

	private void readNames() {
		_NAMES = getResources().getStringArray(R.array._3d_images_name);
	}

	private void readIds() {
		_IDS[0] = R.drawable._3d_0;
		_IDS[1] = R.drawable._3d_1;
		_IDS[2] = R.drawable._3d_2;
		_IDS[3] = R.drawable._3d_3;
		_IDS[4] = R.drawable._3d_4;
		_IDS[5] = R.drawable._3d_5;
		_IDS[6] = R.drawable._3d_6;
		_IDS[7] = R.drawable._3d_7;
		_IDS[8] = R.drawable._3d_8;
		_IDS[9] = R.drawable._3d_9;
		_IDS[10] = R.drawable._3d_10;
		_IDS[11] = R.drawable._3d_11;
		_IDS[12] = R.drawable._3d_12;
		_IDS[13] = R.drawable._3d_13;
		_IDS[14] = R.drawable._3d_14;
		_IDS[15] = R.drawable._3d_15;
		_IDS[16] = R.drawable._3d_16;
		_IDS[17] = R.drawable._3d_17;
		_IDS[18] = R.drawable._3d_18;
		_IDS[19] = R.drawable._3d_19;
		_IDS[20] = R.drawable._3d_20;
		_IDS[21] = R.drawable._3d_21;
		_IDS[22] = R.drawable._3d_22;
		_IDS[23] = R.drawable._3d_23;
		_IDS[24] = R.drawable._3d_24;
		_IDS[25] = R.drawable._3d_25;
		_IDS[26] = R.drawable._3d_26;
		_IDS[27] = R.drawable._3d_27;
		_IDS[28] = R.drawable._3d_28;
		_IDS[29] = R.drawable._3d_29;
		_IDS[30] = R.drawable._3d_30;
		_IDS[31] = R.drawable._3d_31;
		_IDS[32] = R.drawable._3d_32;
		_IDS[33] = R.drawable._3d_33;
		_IDS[34] = R.drawable._3d_34;
		_IDS[35] = R.drawable._3d_35;
		_IDS[36] = R.drawable._3d_36;
		_IDS[37] = R.drawable._3d_37;
		_IDS[38] = R.drawable._3d_38;
		_IDS[39] = R.drawable._3d_39;
		_IDS[40] = R.drawable._3d_40;
		_IDS[41] = R.drawable._3d_41;
		_IDS[42] = R.drawable._3d_42;
		_IDS[43] = R.drawable._3d_43;
		_IDS[44] = R.drawable._3d_44;
		_IDS[45] = R.drawable._3d_45;
		_IDS[46] = R.drawable._3d_46;
		_IDS[47] = R.drawable._3d_47;
		_IDS[48] = R.drawable._3d_48;
		_IDS[49] = R.drawable._3d_49;
		_IDS[50] = R.drawable._3d_50;
		_IDS[51] = R.drawable._3d_51;
		_IDS[52] = R.drawable._3d_52;
		_IDS[53] = R.drawable._3d_53;
		_IDS[54] = R.drawable._3d_54;
		_IDS[55] = R.drawable._3d_55;
		_IDS[56] = R.drawable._3d_56;
		_IDS[57] = R.drawable._3d_57;
		_IDS[58] = R.drawable._3d_58;
		_IDS[59] = R.drawable._3d_59;
		_IDS[60] = R.drawable._3d_60;
		_IDS[61] = R.drawable._3d_61;
		_IDS[62] = R.drawable._3d_62;
		_IDS[63] = R.drawable._3d_63;
		_IDS[64] = R.drawable._3d_64;
		_IDS[65] = R.drawable._3d_65;
		_IDS[66] = R.drawable._3d_66;
		_IDS[67] = R.drawable._3d_67;
		_IDS[68] = R.drawable._3d_68;
		_IDS[69] = R.drawable._3d_69;
		_IDS[70] = R.drawable._3d_70;
		_IDS[71] = R.drawable._3d_71;
		_IDS[72] = R.drawable._3d_72;
		_IDS[73] = R.drawable._3d_73;
		_IDS[74] = R.drawable._3d_74;
		_IDS[75] = R.drawable._3d_75;
		_IDS[76] = R.drawable._3d_76;
		_IDS[77] = R.drawable._3d_77;
		_IDS[78] = R.drawable._3d_78;
		_IDS[79] = R.drawable._3d_79;
		_IDS[80] = R.drawable._3d_80;
		_IDS[81] = R.drawable._3d_81;
		_IDS[82] = R.drawable._3d_82;
		_IDS[83] = R.drawable._3d_83;
		_IDS[84] = R.drawable._3d_84;
		_IDS[85] = R.drawable._3d_85;
		_IDS[86] = R.drawable._3d_86;
		_IDS[87] = R.drawable._3d_87;
		_IDS[88] = R.drawable._3d_88;
		_IDS[89] = R.drawable._3d_89;
		_IDS[90] = R.drawable._3d_90;
		_IDS[91] = R.drawable._3d_91;
		_IDS[92] = R.drawable._3d_92;
		_IDS[93] = R.drawable._3d_93;
		_IDS[94] = R.drawable._3d_94;
		_IDS[95] = R.drawable._3d_95;
		_IDS[96] = R.drawable._3d_96;
		_IDS[97] = R.drawable._3d_97;
		_IDS[98] = R.drawable._3d_98;
		_IDS[99] = R.drawable._3d_99;
	}
}
