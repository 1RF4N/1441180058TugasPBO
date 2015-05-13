public class Asimo extends Robot
{
		public Asimo (int sensorInput, int servoInput, int powerInput, int cameraInput)
		{
		sensor 	= sensorInput;
		servo 	= servoInput;
		power 	= powerInput;
		camera	= cameraInput;
		}

		Robot asi = new Robot();

		public void CetakSpesifikasi()
 		{
 		System.out.println("Jumlah Sensor Robot 	:"+asi.getSensor());
		System.out.println("Jumlah Sensor Asimo 	:"+getSensor());
        System.out.println("Jumlah Servo		:"+getServo());
        System.out.println("Jumlah Power 		:"+getPower());
        System.out.println("Jumlah Kamera 		:"+getCamera());
    	}

    	public void Upgrade(int sensor)
    	{
    		System.out.println();
    		System.out.print("Asimo diupgrade dengan jumlah sensor :"+sensor);
    	}
}