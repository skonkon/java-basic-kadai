package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		Kato_Chapter18 Taro = new KatoTaro_Chapter18();
		Kato_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 Hanako = new KatoHanako_Chapter18();

		Taro.setGivenName();
		Taro.execIntroduce();

		System.out.println();

		Ichiro.setGivenName();
		Ichiro.execIntroduce();

		System.out.println();

		Hanako.setGivenName();
		Hanako.execIntroduce();

	}

}