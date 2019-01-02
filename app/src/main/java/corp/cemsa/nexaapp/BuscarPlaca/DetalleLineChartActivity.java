package corp.cemsa.nexaapp.BuscarPlaca;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;


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
import com.anychart.anychart.ValueDataEntry;

import java.util.ArrayList;
import java.util.List;

import corp.cemsa.nexaapp.R;

public class DetalleLineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_line_chart);

        setActionBar();

        ///Bloquear contenido del registro

        EditText etp= (EditText)findViewById(R.id.d_p);
        EditText etp2= (EditText)findViewById(R.id.d_s);
        EditText etp3= (EditText)findViewById(R.id.d_t);
        Spinner etp4 = (Spinner)findViewById(R.id.d_c);
        EditText etp5 = (EditText)findViewById(R.id.d_q);
        EditText etp6 = (EditText)findViewById(R.id.d_se);
        EditText etp8 = (EditText)findViewById(R.id.d_sep);
        EditText etp9 = (EditText)findViewById(R.id.d_o);
        EditText etp10 = (EditText)findViewById(R.id.d_n);
        EditText etp11 = (EditText)findViewById(R.id.d_d);
        EditText etp12 = (EditText)findViewById(R.id.d_on);
        EditText etp13 = (EditText)findViewById(R.id.d_do);


        etp.setFocusable(false);
        etp.setEnabled(false);
        etp2.setFocusable(false);
        etp2.setEnabled(false);
        etp3.setFocusable(false);
        etp3.setEnabled(false);
        etp4.setFocusable(false);
        etp4.setEnabled(false);
        etp5.setFocusable(false);
        etp5.setEnabled(false);
        etp6.setFocusable(false);
        etp6.setEnabled(false);
        etp8.setFocusable(false);
        etp8.setEnabled(false);
        etp9.setFocusable(false);
        etp9.setEnabled(false);
        etp10.setFocusable(false);
        etp10.setEnabled(false);
        etp11.setFocusable(false);
        etp11.setEnabled(false);
        etp12.setFocusable(false);
        etp12.setEnabled(false);
        etp13.setFocusable(false);
        etp13.setEnabled(false);
        ///FIN///

       AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian cartesian = AnyChart.line();

        cartesian.setAnimation(true);

        cartesian.setPadding(10d, 20d, 5d, 20d);

        cartesian.getCrosshair().setEnabled(true);
        cartesian.getCrosshair()
                .setYLabel(true)
                .setYStroke((Stroke) null, null, null, null, null);

        cartesian.getTooltip().setPositionMode(TooltipPositionMode.POINT);

        cartesian.setTitle("Perdida de peso(Kg) por el tiempo");

        cartesian.getYAxis().setTitle("Cantidad de peso(Kg)");
     cartesian.getXAxis().setTitle("Fecha");

     cartesian.getXAxis().getLabels().setPadding(5d, 5d, 5d, 5d);

        List<DataEntry> seriesData = new ArrayList<>();
        seriesData.add(new CustomDataEntry("14/10/18", 8));
        seriesData.add(new CustomDataEntry("24/11/18", 10));
        seriesData.add(new CustomDataEntry("30/11/18", 5));
        seriesData.add(new CustomDataEntry("15/12/18", 6));



        Set set = new Set(seriesData);
        Mapping series1Mapping = set.mapAs("{ x: 'x', value: 'value' }");


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



        cartesian.getLegend().setEnabled(true);
        cartesian.getLegend().setFontSize(13d);
        cartesian.getLegend().setPadding(0d, 0d, 10d, 0d);

        anyChartView.setChart(cartesian);
    }


    private void setActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    private class CustomDataEntry extends ValueDataEntry {

        CustomDataEntry(String x, Number value) {
            super(x, value);

        }

    }
    }
