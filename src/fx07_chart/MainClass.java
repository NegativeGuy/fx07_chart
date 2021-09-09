package fx07_chart;

import fx07_chart.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml")); // fxml연동
		Parent root = loader.load(); // 로드 후 root에 대입
		Scene scene = new Scene(root); // scene 객체 생성. root(신빌더로 만든 요소들 들어있음) 보냄
		
		Controller ctl = loader.getController(); // loader변수 통해서 컨트롤러 가져옴
		ctl.setRoot(root);	// 컨트롤러 클래스에 root 보냄(setRoot 매서드로)
		
		arg0.setScene(scene); //신빌더로 만든 요소들이 담긴 scene을 setScene으로 보냄
		arg0.show(); // 보낸 걸 화면에 띄움(show)
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
