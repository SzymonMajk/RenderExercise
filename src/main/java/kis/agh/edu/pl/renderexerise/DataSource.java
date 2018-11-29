package kis.agh.edu.pl.renderexerise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataSource {

    public enum Position {
        WINDOW,MIDDLE,BORDER,STANDING
    }

    public class Trip {
        private String start;
        private String end;
        private String duration;
        private String payMethod;

        private boolean hasBaggage;
        private boolean hasDog;
        private boolean needFreshAir;
        private boolean isActive;

        private Position position;

        public String getStart() {
            return start;
        }

        public String getEnd() {
            return end;
        }

        public String getDuration() {
            return duration;
        }

        public String getPayMethod() {
            return payMethod;
        }

        public String shortDescription() {
            return start + "  --->  " + end;
        }

        public Trip(String start, String end, String duration, String payMethod,
                    boolean hasBaggage, boolean hasDog, boolean needFreshAir, boolean isActive,
                    Position position) {
            this.start = start;
            this.end = end;
            this.duration = duration;
            this.payMethod = payMethod;
            this.hasBaggage = hasBaggage;
            this.hasDog = hasDog;
            this.needFreshAir = needFreshAir;
            this.isActive = isActive;
            this.position = position;
        }

        public boolean hasBaggage() {
            return hasBaggage;
        }

        public boolean hasDog() {
            return hasDog;
        }

        public boolean isNeedFreshAir() {
            return needFreshAir;
        }

        public boolean isActive() {
            return isActive;
        }

        public Position getPosition() {
            return position;
        }
    }

    public List<Trip> getData() {
        List<Trip> result = new ArrayList<>();

        for(int i = 0; i <= 300; ++i) {
            result.add(randomGenerate());
        }

        return result;
    }

    private Trip randomGenerate() {
        Random random = new Random();
        int number = Math.abs(random.nextInt());
        int secondCity = Math.abs(random.nextInt());

        String city = "Cracov";
        String destiny = "Moscow";
        String dur = "2h 30min";
        String method = "card";

        boolean hasBaggage = false;
        boolean hasDog = false;
        boolean needFreshAir = false;
        boolean isActive = false;

        Position position = Position.STANDING;

        switch (number % 8) {
            case 0:
                city = "Prague";
                break;
            case 1:
                city = "Madrit";
                break;
            case 2:
                city = "London";
                break;
            case 3:
                city = "Bratislava";
                break;
            case 4:
                city = "Paris";
                break;
            case 5:
                city = "Oslo";
                break;
            case 6:
                city = "Moscow";
                break;
            case 7:
                city = "Oxford";
                break;
        }

        if(!(number == secondCity)) {
            switch (secondCity % 8) {
                case 0:
                    destiny = "Prague";
                    break;
                case 1:
                    destiny = "Madrit";
                    break;
                case 2:
                    destiny = "London";
                    break;
                case 3:
                    destiny = "Bratislava";
                    break;
                case 4:
                    destiny = "Paris";
                    break;
                case 5:
                    destiny = "Oslo";
                    break;
                case 6:
                    destiny = "Moscow";
                    break;
                case 7:
                    destiny = "Oxford";
                    break;
            }
        }

        number =  Math.abs(random.nextInt());
        switch (number % 8) {
            case 0:
                dur = "14h 30min";
                break;
            case 1:
                dur = "17h 30min";
                break;
            case 2:
                dur = "5h 30min";
                break;
            case 3:
                dur = "2h 30min";
                break;
            case 4:
                dur = "18h 30min";
                break;
            case 5:
                dur = "17h 30min";
                break;
            case 6:
                dur = "1h 30min";
                break;
            case 7:
                dur = "12h 15min";
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 2) {
            case 0:
                method = "card";
                break;
            case 1:
                method = "cash";
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 2) {
            case 0:
                hasBaggage = true;
                break;
            case 1:
                hasBaggage = false;
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 2) {
            case 0:
                hasDog = true;
                break;
            case 1:
                hasDog = false;
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 2) {
            case 0:
                needFreshAir = true;
                break;
            case 1:
                needFreshAir = false;
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 2) {
            case 0:
                isActive = true;
                break;
            case 1:
                isActive = false;
                break;
        }

        number =  Math.abs(random.nextInt());
        switch (number % 4) {
            case 0:
                position = Position.STANDING;
                break;
            case 1:
                position = Position.WINDOW;
                break;
            case 2:
                position = Position.MIDDLE;
                break;
            case 3:
                position = Position.BORDER;
                break;
        }

        return new Trip(city, destiny, dur, method,
                hasBaggage, hasDog, needFreshAir, isActive, position);
    }

}
