public class mainTubeVideo {
    public static void main(String[] args)
    {
        SayaTubeVideo a = new SayaTubeVideo("Tutorial Design By Contract – Ahmad Naufal Diwantara Putra");
        a.PrintVideoDetails();
        a.IncreasePlayCount(0);
        a.PrintVideoDetails();
    }
}
