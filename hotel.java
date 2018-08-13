public class hotel extends dates{
    String hname;dates d;
        int type,a,b;
 public hotel(String hname) 
    {
        this.hname=hname;
    }
    public hotel(int type,int a,int b) 
    {
        this.type=type;
        this.a=a;
        this.b=b;
    }
    public String inserthotelname (String hname)
    {
    if( null != hname)
        switch (hname) {
            case "helliton":
                return ("Available");
            case "sheraton":
                return ("Available");
            case "down town":
                return ("Available");
            default:
                return ("not Available");
        }
    return "";
    }
public String choseroomtype(int type,int a,int b)
    {
        switch (type) {
            case 1:
                return (super.InsertbookingDates1(a,b));
            case 2:
                return (super.InsertbookingDates2(a,b));
            default:
                return (super.InsertbookingDates3(a,b));
        }

}
}