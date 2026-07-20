package org.tnsif.acc.c2tc.sr_developer;
import org.tnsif.acc.c2tc.jr_developer.KIA_Airbags;
import org.tnsif.acc.c2tc.jr_developer.KIA_Speedlimit;
public class KIA_Internal {

	public static void main(String[] args) {
		KIA_Speedlimit speedlimit = new KIA_Speedlimit();
		speedlimit.disp_speedlimit();
		KIA_Airbags airbags = new KIA_Airbags();
		airbags.disp_airbags();

		// TODO Auto-generated method stub

	}

}
