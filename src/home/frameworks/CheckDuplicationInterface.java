package home.frameworks;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CheckDuplicationInterface extends Remote {

	public static boolean checkOverLapData(String str1, String str2) throws RemoteException {
		return false;
	}
	public static void manageLectureFile(String selectedLectures, String targetFileName, String mode) throws RemoteException {
	}
	public static void manageUserFile(String userInfo, String TargetFileName) throws RemoteException {
	}
	public static void manageCurrentUser(String userInfo, String TargetFileName) throws RemoteException {
	}
}
