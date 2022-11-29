package latihanenkapsulasi;
public class LatihanEnkapsulasi {
    public static void main(String[] args) {
Nilai n= new Nilai();
n.setTeori(4);
n.setPraktik(2);    

        System.out.println("Nilai Teori : "+n.getTeori());
        System.out.println("Nilai Praktik : "+n.getPraktik());
        System.out.println("Nilai Akhir : "+n.getNilai());
}
    
}
