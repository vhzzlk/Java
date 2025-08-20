package A6;

public class funcionarioMain {
    public static void main(String[] args) {
        contador cont = new contador("Victor", "123456789", 10000, 1);

        Eletricista ele = new Eletricista("victor" ,"123456787" , 10000, true);
        System.out.println(ele.calcularSalario());
    }
}
