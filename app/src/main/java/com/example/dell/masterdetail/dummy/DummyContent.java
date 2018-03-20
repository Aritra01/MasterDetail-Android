package com.example.dell.masterdetail.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();



    static {
        // Add your list items here.
        addItem(new DummyItem("1", "Google", "https://www.google.co.nz"));
        addItem(new DummyItem("2", "Facebook", "https://www.facebook.com"));
        addItem(new DummyItem("3", "Microsoft", "https://www.microsoft.com/en-nz"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }




    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String page_name;
        public final String url;

        public DummyItem(String id, String page_name, String url) {
            this.id = id;
            this.page_name = page_name;
            this.url = url;
        }

        @Override
        public String toString() {
            return page_name;
        }
    }
}
