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
	@Override
	public void show(Funktion f,Funktion g,double x1, double x2, int anzahl) 
	{
		XYSeries series1 = new XYSeries(f.getName());
		XYSeries series2 = new XYSeries(g.getName());
		double d = (double) anzahl;
		double dx = (x2 - x1) / d;
		double x = x1;
		for (int i=0;i<anzahl;i++)
		{
			double y1 = f.get(x);
			double y2 = g.get(x);
			series1.add(x,y1);
			series2.add(x,y2);
			x += dx;
		}
		XYSeriesCollection collection = new XYSeriesCollection();
		collection.addSeries(series1);
		collection.addSeries(series2);
		JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         "",
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
