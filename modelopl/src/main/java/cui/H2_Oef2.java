package cui;

public class H2_Oef2
{
    public static void main(String[] args)
    {
        new H2_Oef2().herschrijfMetConditioneleOperator();
    }

    private void herschrijfMetConditioneleOperator()
    {
        int aantal = 1;
        System.out.println(aantal == 1 ? "Student" : "Studenten");
    }
}
