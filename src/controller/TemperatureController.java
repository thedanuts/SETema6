package controller;

import model.TemperatureModel;
import views.TemperatureView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Danuts on 11/30/2014.
 */
public class TemperatureController {
    private TemperatureView mView;
    private TemperatureModel mModel;

    public TemperatureController(TemperatureView theView, TemperatureModel theModel){
        this.mView=theView;
        this.mModel=theModel;

        this.mView.addListener(new TemperatureListener());
    }

    class TemperatureListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0) {
            mModel.setDegrees();
            mModel.setWindSpeed();

            mView.setDegrees(mModel.getDegrees());
            mView.setSpeed(mModel.getWindSpeed());
        }
    }
}
