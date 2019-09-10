package com.alharoof.diabetracker.data.logbook.model

enum class BglUnit(val code: Int, val symbol: String, val title: String) {
    MILLIGRAMS_PER_DECILITRE(1, "mg/dL", "Milligrams Per Decilitre"),
    MILLIMOLES_PER_LITRE(2, "mmol/L", "Millimoles Per Litre")
}
