package Airport.Events;


import Airport.Airplane.Aircraft;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/* logfile fuer (#, aircraft_id, unix_timestamp, event_message) */

public class FlightRecorder {

    private Aircraft aircraft;
    private final Logger logger = Logger.getLogger(FlightRecorder.class.getName());
    private FileHandler fh = null;

    public FlightRecorder() {

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
        logger.info("info msg");
        logger.severe("error message");
        logger.fine("fine message"); //won't show because to high level of logging
    }
}
