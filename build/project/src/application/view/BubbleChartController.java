package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class BubbleChartController {
	
	@FXML
	private Pane paneview;
	
	@FXML
	private void initialize() {
		load();
	}
	
	private void load() {
		final NumberAxis xAxis = new NumberAxis(1, 50, 1);
		final NumberAxis yAxis = new NumberAxis(0,80,0);
		xAxis.setLabel("Week");
		yAxis.setLabel("Product Budget");
		
		final BubbleChart<Number, Number> bc = new BubbleChart<>(xAxis, yAxis);
		bc.setTitle("Budget Monitoring");
		
		XYChart.Series series1 = new XYChart.Series<>();
		series1.setName("Product 1");
        series1.getData().add(new XYChart.Data(3, 35));
        series1.getData().add(new XYChart.Data(12, 60));
        series1.getData().add(new XYChart.Data(15, 15));
        series1.getData().add(new XYChart.Data(22, 30));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Product 2");
        series2.getData().add(new XYChart.Data(8, 15));
        series2.getData().add(new XYChart.Data(13, 23));
        series2.getData().add(new XYChart.Data(15, 45));
        series2.getData().add(new XYChart.Data(24, 30));
        
        bc.getData().addAll(series1, series2);
        
        paneview.getChildren().add(bc);
	}
}