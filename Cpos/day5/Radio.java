class Radio{
  String StationName,RjName,ProgramName;
  double Frequency,duration;
  
  void display(String StationName,String RjName,String ProgramName,double Frequency,double duration)
   {
	 System.out.print(StationName+" ");
	 System.out.print(RjName+" ");
	 System.out.print(ProgramName+" ");
	 System.out.print(Frequency+" ");
	 System.out.println(duration+"minutes");
   }
   void PlayRadio()
   {
	   System.out.println("Playing...");
   }
   void StopRadio()
   {
	   System.out.println("Stopped");
   }
   void Record()
   {
	   System.out.println("Recording....");
   }
   void ChangeChannel()
   {
	   System.out.println("Channel Changed");
   }
   public static void main(String args[])
   { 
     Radio FM = new Radio();
	 FM.display("Big FM","Neelesh Mishra","Yaadon ka idiot box",92.7,30);
	 FM.PlayRadio();
	 FM.Record();
	 FM.ChangeChannel();
	 FM.StopRadio();
   }
}
  