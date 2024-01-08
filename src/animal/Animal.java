package animal;

//Humanクラスの親
public class Animal {
    //フィールド
    private String animalName;
    private int animalAge;

    public Animal(){

    }
    //コンストラクタ 名前・年齢格納する引数設定。処理内容として名前・年齢を初期化する
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //sayメソッド
    public void say() {
        System.out.println(animalName + "です。" + animalAge + "歳です。");
    }


}
