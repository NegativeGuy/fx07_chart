package fx07_chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class Controller implements Initializable{
	
	PieChart pieChart;
	BarChart barChart;
	AreaChart areaChart;
	
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		areaChart = (AreaChart)root.lookup("#areaChart");
		cahrt();
	}
	
	public void cahrt() {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 10),
				new PieChart.Data("Swing", 30),
				new PieChart.Data("JavaFx", 30),
				new PieChart.Data("Java", 30)
				)); //fx에서 쓰는 어레이리스트
		
		// xy형태의 자료는 xy차트로 우선 틀을 만들고 
		// 그것을 bar나 area차트에 해당 데이터를 표현하는 방식
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016", 70),
				new XYChart.Data("2017", 40),
				new XYChart.Data("2018", 50),
				new XYChart.Data("2019", 90)
				));		
		barChart.getData().add(series1);
		
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016", 30),
				new XYChart.Data("2017", 80),
				new XYChart.Data("2018", 100),
				new XYChart.Data("2019", 70)
				));		
		barChart.getData().add(series2);
		
		XYChart.Series series3 = new XYChart.Series();
		series3.setName("동물");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016", 10),
				new XYChart.Data("2017", 40),
				new XYChart.Data("2018", 30),
				new XYChart.Data("2019", 80)
				));		
		barChart.getData().add(series3);
		
		
		XYChart.Series series4 = new XYChart.Series();
		series4.setName("평균온도");
		series4.setData(FXCollections.observableArrayList(
				new XYChart.Data("2016", 13),
				new XYChart.Data("2017", 8),
				new XYChart.Data("2018", 10),
				new XYChart.Data("2019", 7)
				));
		areaChart.getData().add(series4);
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
