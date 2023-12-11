package web_porject01;


// ①リスナーのインターフェイスを作成する。
interface CustomListener {
	//リスナーが実装する関数(Overrideする関数)
	void customFunction(); 
}

public class TestListnerEvent {

	//　カスタムリスナーを格納する変数
	private CustomListener listener;
	
	// リスナーをセットする関数
	public void setCustomListener(CustomListener listener) {
		this.listener = listener;
		System.out.println(getClass().getName() + " listener: " + listener);
		System.out.println("MainProjectでリスナーが使うことを設定した");
	}
	
	// イベントを発生させる関数
	public void actionEvent() {
		if(listener != null) {
			listener.customFunction(); // カスタムイベントのリスナー
			System.out.println("カスタムイベントのリスナー");
		}
	}
//
//	// リスナーオブジェクト生成
//	private static TestListnerEvent listener;
//	
//	public static void main(String[] args) {
//		
//		listener = new TestListnerEvent();
//		
//		// リスナーを設定
//		listener.setCustomListener(new CustomListener() {
//			
//			@Override
//			public void customFunction() {
//				//　イベントが発生した時の処理をここに書く。
//				System.out.println("オーバーライド内の処理です");
//				
//			}
//		});
//		
//		// listener.customFunction()を発生させるよ。
//		listener.actionEvent();
//		
//		try {
//			System.out.println("メイン処理のあるところ(try)");
//		} catch (Exception e) {
//			System.out.println("catch処理");
//		}
//	}
}
