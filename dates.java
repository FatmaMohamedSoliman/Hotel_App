abstract class dates {
static int count1=0,count2=0,count3=0;

 public String InsertbookingDates1(int a,int b)
  {     
      if(a>=1&&b<=18)
          {
                if(count1<10)
                return ("Available");
                count1++;
            }
      else
          return ("not Available");
     return "";
  }
       public String InsertbookingDates2(int a,int b)
  {
            if(a>=5&&b<=20)
            {
                if(count2<10)
          return ("Available");
                count2++;
            }
      else
          return ("not Available");
            return "";
  }
     public String InsertbookingDates3(int a,int b)
  {
    if(a>=7&&b<=25)
      {
        if(count3<10) 
            return ("Available");
        count3++;
            }
      else
          return "not Available";
    return "";
  }
  
    }