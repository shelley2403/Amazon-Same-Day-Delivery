/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AmazonOrderManagementRole;


import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.AmazonOrderManagementOrganization;
import Business.Organization.Organization;
import java.awt.Color;
import java.awt.GradientPaint;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * 
 */
public class Visualization extends javax.swing.JPanel{

    
    private JFreeChart chart;
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    /**
     * Creates new form Visualization
     */
    public Visualization(JPanel userProcessContainer,EcoSystem system ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        displayChart();
    }
    
    
    /**
     * Step 3, display the chart
     * Notice, in order to make swing display the chart, make sure you set the panel to BorderLayout
     */
    private void displayChart() {
        this.chart = createChart(createDataset(system));
        ChartPanel chartPanel = new ChartPanel(chart);  //Create a ChartPanel based on JFreeChart in order to display in Swing
        this.add(chartPanel);
        this.validate();    //call this method to re-paint the JPanel
    }
    
    /**
     * Visualization step 1, create the dataset for visualization
     * @param system
     * @return 
     */
    private CategoryDataset createDataset(EcoSystem system) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            AmazonOrderManagementOrganization aomo = null;
             for (Organization organization1 : system.getOrganizationDirectory().getOrganizationList()) {
                if (organization1 instanceof AmazonOrderManagementOrganization) {
                      aomo = (AmazonOrderManagementOrganization) organization1;
                }
             }
             if(aomo!=null){
        for (Order order : aomo.getMasterOrderList().getOrderList()){
         ArrayList <OrderItem> tempList = order.getOrderItemList();
                for (OrderItem oi : tempList){
                    dataset.addValue(oi.getEnterprise(), oi.getDeliveryStatus(), oi.getDeliveryStatus());
                    }
                }
            }
             return dataset;
        }
       
    
    
    /**
     * Visualization step 2, configure the chart
     * @param dataset
     * @return 
     */
    private JFreeChart createChart(CategoryDataset dataset) {

        // create the chart...
        //Please take a look at API doc to see other available charts
        JFreeChart chart = ChartFactory.createBarChart(
            "Bar Chart Demo",       // chart title
            "Enterprise",               // domain axis label
            "Delivery Status",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // ******************************************************************
        //  More than 150 demo applications are included with the JFreeChart
        //  Developer Guide...for more information, see:
        //
        //  >   http://www.object-refinery.com/jfreechart/guide.html
        //
        // ******************************************************************

        // set the range axis to display integers only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        // set up gradient paints for series...
        // You can choose not to set up gradient paint, JFreeChart will setup the default color for you
        GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.blue,
                0.0f, 0.0f, new Color(0, 0, 64));
        GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.green,
                0.0f, 0.0f, new Color(0, 64, 0));
        GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.red,
                0.0f, 0.0f, new Color(64, 0, 0));
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(
                        Math.PI / 6.0));
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
