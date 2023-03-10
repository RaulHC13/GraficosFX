/**
 * JavaFX2_charts_statistics_HerreriasCorralRaul - application.view - AreaController.java
 * 9 feb 2023 - 12:56:14
 * @author Raúl Herrerías Corral
 */
package application.view;

import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class AreaController {

	@FXML
	private Pane paneview;
	
	@FXML
	private void initialize() {
		load();
	}
	
	public void load() {
		final NumberAxis xAxis = new NumberAxis(1, 31, 1); //Min, max, increase
        final NumberAxis yAxis = new NumberAxis(); //Los parámetros se generan automáticamente al meter datos
        final AreaChart<Number,Number> ac = new AreaChart<>(xAxis,yAxis);
        ac.setTitle("Temperature Monitoring (in Degrees C)");
 
        XYChart.Series seriesApril= new XYChart.Series(); //Se crea una serie
        seriesApril.setName("April");
        seriesApril.getData().add(new XYChart.Data(1, 4)); //Se le van pasando datos, eje x e y
        seriesApril.getData().add(new XYChart.Data(3, 10));
        seriesApril.getData().add(new XYChart.Data(6, 15));
        seriesApril.getData().add(new XYChart.Data(9, 8));
        seriesApril.getData().add(new XYChart.Data(12, 5));
        seriesApril.getData().add(new XYChart.Data(15, 18));
        seriesApril.getData().add(new XYChart.Data(18, 15));
        seriesApril.getData().add(new XYChart.Data(21, 13));
        seriesApril.getData().add(new XYChart.Data(24, 19));
        seriesApril.getData().add(new XYChart.Data(27, 21));
        seriesApril.getData().add(new XYChart.Data(30, 21));
        
        XYChart.Series seriesMay = new XYChart.Series();
        seriesMay.setName("May");
        seriesMay.getData().add(new XYChart.Data(1, 20));
        seriesMay.getData().add(new XYChart.Data(3, 15));
        seriesMay.getData().add(new XYChart.Data(6, 13));
        seriesMay.getData().add(new XYChart.Data(9, 12));
        seriesMay.getData().add(new XYChart.Data(12, 14));
        seriesMay.getData().add(new XYChart.Data(15, 18));
        seriesMay.getData().add(new XYChart.Data(18, 25));
        seriesMay.getData().add(new XYChart.Data(21, 25));
        seriesMay.getData().add(new XYChart.Data(24, 23));
        seriesMay.getData().add(new XYChart.Data(27, 26));
        seriesMay.getData().add(new XYChart.Data(31, 26));
        
        ac.getData().addAll(seriesApril, seriesMay);
        
        paneview.getChildren().add(ac);
	}
}