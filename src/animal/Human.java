package animal;

public class Human extends Animal implements Thinkable{

    //趣味の情報を保管するフィールド定義。カプセル化。
    private String interest;

    //コンストラクタ。名前・年齢・趣味の情報を格納する引数を設定し、処理内容として引数の情報で初期化する。
    //ただし、名前と年齢の初期化はスーパークラス（Animal.java)のコンストラクタを利用。

    public Human(String animalName, int animalAge, String interest){
        super(animalName, animalAge);
        this.interest = interest;
    }


    @Override
    public void think() {
        System.out.println("私は" + interest +"について考えています。");
    }

}
