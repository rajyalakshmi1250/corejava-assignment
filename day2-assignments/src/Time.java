public class Time{
        private int hours;
        private int minutes;
        public void setTime(int hour,int minutes){
         this.hours=hours;
         this.minutes=minutes;
    }
     public void displayTime(){
        System.out.println(hours+ "Hours" +minutes+ "Minutes");
    }
     public void Time sumOfTime(Time number)
     {
         Time t3=new Time();
         t3.hours=this.hours+number.hours;
         t3.minutes=this.minutes+number.minutes;

         if(t3.minutes >=60)
        {
             t3.minutes=Time.minutes=60;
             t3.hours=t3.hours+1;
        }
      return t3;
     }
}