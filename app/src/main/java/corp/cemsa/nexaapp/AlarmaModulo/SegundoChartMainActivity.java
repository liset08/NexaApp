package corp.cemsa.nexaapp.AlarmaModulo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.CartesianSeriesLine;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.EnumsAnchor;
import com.anychart.anychart.Mapping;
import com.anychart.anychart.MarkerType;
import com.anychart.anychart.Set;
import com.anychart.anychart.Stroke;
import com.anychart.anychart.TooltipPositionMode;

import java.util.ArrayList;
import java.util.List;

import corp.cemsa.nexaapp.Menu.MenuMainActivity;
import corp.cemsa.nexaapp.R;

public class SegundoChartMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_chart_main);

        segundochart();
    }

    public void EnviarReporte(View view) {
        Intent intent = new Intent(this, MenuMainActivity.class);
        startActivity(intent);
    }
    public void segundochart(){

        AnyChartView anyChartView2 = findViewById(R.id.any_chart_view3);
        anyChartView2.setProgressBar(findViewById(R.id.progress_bar3));

        Cartesian cartesian = AnyChart.line();

        cartesian.setAnimation(true);

        cartesian.setPadding(10d, 20d, 5d, 20d);

        cartesian.getCrosshair().setEnabled(true);
        cartesian.getCrosshair()
                .setYLabel(true)
                .setYStroke((Stroke) null, null, null, null, null);

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);

        cartesian.setTitle("Medicion de la humedad en entradas y salidas de camiones en la Minera NEXA");

        cartesian.getYAxis().setTitle("Humedad(%)");
        cartesian.getXAxis().setTitle("Fecha");

        cartesian.getXAxis().getLabels().setPadding(5d, 5d, 5d, 5d);

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new ReporteMainActivity.CustomDataEntry("14/10/18", 20,30,20));
        seriesData.add(new ReporteMainActivity.CustomDataEntry("24/11/18", 30,40,60));
        seriesData.add(new ReporteMainActivity.CustomDataEntry("30/11/18", 40,50,40));
        seriesData.add(new ReporteMainActivity.CustomDataEntry("15/12/18", 60,70,85));



        Set set = new Set(seriesData);
        Mapping series1Mapping = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping series2Mapping = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping series3Mapping = set.mapAs("{ x: 'x', value: 'value3' }");

        CartesianSeriesLine series1 = cartesian.line(series1Mapping);
        series1.setName("AOC123");
        series1.getHovered().getMarkers().setEnabled(true);
        series1.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series1.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        CartesianSeriesLine series2 = cartesian.line(series2Mapping);
        series2.setName("DFG465");
        series2.getHovered().getMarkers().setEnabled(true);
        series2.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series2.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        CartesianSeriesLine series3 = cartesian.line(series3Mapping);
        series3.setName("S0D846");
        series3.getHovered().getMarkers().setEnabled(true);
        series3.getHovered().getMarkers()
                .setType(MarkerType.CIRCLE)
                .setSize(4d);
        series3.getTooltip()
                .setPosition("right")
                .setAnchor(EnumsAnchor.LEFT_CENTER)
                .setOffsetX(5d)
                .setOffsetY(5d);

        cartesian.getLegend().setEnabled(true);
        cartesian.getLegend().setFontSize(13d);
        cartesian.getLegend().setPadding(0d, 0d, 10d, 0d);

        anyChartView2.setChart(cartesian);
    }
}
