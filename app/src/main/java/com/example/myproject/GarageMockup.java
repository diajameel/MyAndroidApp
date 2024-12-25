package com.example.myproject;

public class GarageMockup {
        private String garageName;
        private String location;
        private String personalName;
        private int logoImageResource;

        // Constructor
        public GarageMockup(String garageName, String location, String personalName, int logoImageResource) {
            this.garageName = garageName;
            this.location = location;
            this.personalName = personalName;
            this.logoImageResource = logoImageResource;
        }

        // Getters
        public String getGarageName() {
            return garageName;
        }

        public String getLocation() {
            return location;
        }

        public String getPersonalName() {
            return personalName;
        }

        public int getLogoImageResource() {
            return logoImageResource;
        }
    }


