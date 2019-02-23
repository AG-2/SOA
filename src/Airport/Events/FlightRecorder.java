package Airport.Events;


import Airport.Airplane.Aircraft;
import Airport.Airplane.Names;
import jdk.jfr.Event;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/* logfile fuer (#, aircraft_id, unix_timestamp, event_message) */

public class FlightRecorder {

    private Aircraft aircraft;
    int id;
    private final Logger logger = Logger.getLogger(FlightRecorder.class.getName());
    Names.AircraftName aircraftName;


    private void writeEventLog(Event event, String message) {

        File logFile = new File("out/AircraftLogs/" + aircraftName + ".txt");


        ArrayList<String> lines = new ArrayList<String>();

        if (!logFile.exists()) {

            logFile.getParentFile().mkdirs();

            try {

                logFile.createNewFile();

            } catch (IOException e) {

                e.printStackTrace();

            }

        } else {

            try {

                BufferedReader br = new BufferedReader(new FileReader(logFile));

                String l;

                while ((l = br.readLine()) != null) {

                    lines.add(l);

                }

            } catch (IOException e) {

                e.printStackTrace();

            }
        }
    }

}



   // private FileHandler fh = null;

   /* public FlightRecorder() {

        ArrayList<String> logging = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("M-d_HHmmss");
        try {
            fh = new FileHandler("C:/temp/test/FlightRecorder_"
                    + format.format(Calendar.getInstance().getTime()) + ".log");
        } catch (Exception e) {
            e.printStackTrace();
        }

        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }

    public void doLogging() {
        logger.info("info");
        logger.severe("error message");
        logger.fine("fine message"); //won't show because to high level of logging
    }*/

