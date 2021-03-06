/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String Button_1 = "f0001121-0451-4000-b000-000000000000";
    public static String Button_2 = "f0001122-0451-4000-b000-000000000000";
    public static String Red_LED = "f0001111-0451-4000-b000-000000000000";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String Touchpad = "f0001132-0451-4000-b000-000000000000";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb",  "Taktil");

        attributes.put("f0001110-0451-4000-b000-000000000000",  "LED");
        attributes.put("f0001111-0451-4000-b000-000000000000",  "Red");
        attributes.put("f0001112-0451-4000-b000-000000000000",  "Green");

        attributes.put("f0001120-0451-4000-b000-000000000000",  "Buttons");
        attributes.put("f0001121-0451-4000-b000-000000000000",  "Button 1");
        attributes.put("f0001122-0451-4000-b000-000000000000",  "Button 2");

        attributes.put("f0001132-0451-4000-b000-000000000000", "Touchpad");
        // Sample Characteristics.
        attributes.put(Button_1, "Button 1");
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
