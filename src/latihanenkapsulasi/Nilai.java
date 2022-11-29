package latihanenkapsulasi;
public class Nilai {

public int teori;
public int praktik;

public int getTeori(){
return teori;
}    

public void setTeori(int teori){
this. teori=teori;
}

public int getPraktik(){
return praktik;
}

public void setPraktik(int praktik){
this.praktik=praktik;
}

public Nilai(){
int t=0;
int p=0;
}

public int nilai(int t, int p){
return (t+p)/2;
}

public int getNilai(){
return nilai(teori, praktik);
}
}
