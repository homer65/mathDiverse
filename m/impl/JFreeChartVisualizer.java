package m.impl;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import m.*;
public class JFreeChartVisualizer implements Visualizer
{
	@Override
	public void show(Funktion f, double x1, double x2, int anzahl) 
	{
		XYSeries series = new XYSeries("");
		double d = (double) anzahl;
		double dx = (x2 - x1) / d;
		double x = x1;
		for (int i=0;i<anzahl;i++)
		{
			double y = f.get(x);
			series.add(x,y);
			x += dx;
		}
		XYSeriesCollection collection = new XYSeriesCollection();
		collection.addSeries(series);
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         f.getName(),
		         "" ,
		         "" ,
		         collection,
		         PlotOrientation.VERTICAL ,
		         true , true , false);
		ChartPanel chartPanel = new ChartPanel(xylineChart );
	    chartPanel.setPreferredSize( new java.awt.Dimension(1120,734));
	    JFrame frame = new JFrame();
	    frame.setContentPane(chartPanel);
	    frame.pack();
	    frame.setVisible(true);
	}
}
