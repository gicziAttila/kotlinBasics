package com.example.kotlinbasics.model

import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.service.controls.Control

data class WeatherResponse(
    val main: Main,
)
data class Main(
    val temp: Double,
)



//1. feladat
data class Order(
    val orderId: String,
    val customer: Customer,
    val orderItems: List<Orders>,
    val shipping: Shipping,
    val payment: Payment,
    val status: String,
)
data class Customer(
    val customerId: String,
    val name: String,
    val email: Email,
    val phone: Phone
)
data class Orders(
    val itemId: String,
    val productName: String,
    val quantity: Long,
    val pricePerUnit: Double,
    val discount: Double,
)
data class Shipping(
    val address: Address,
    val shippingMethod: String,
    val estimatedDeliveryDays: Long,
)
data class Address(
    val street: String,
    val city: String,
    val postalcode: Byte,
    val country: String,
)
data class Payment(
    val paymentMethod: String,
    val totalAmount: Double,
    val paid: Boolean,
)


//2. feladat
data class Project(
    val projectName: String,
    val subject: String,
    val durationWeeks: Long,
    val teamMembers: List<TeamMember>,
    val assigments: List<Assigment>,
    val completed: Boolean
)
data class TeamMember(
    val studentId: String,
    val name: String,
    val grade: Long,
    val hasCompleted: Boolean
)
data class Assigment(
    val assigmentName: String,
    val maxPoints: Long,
    val studentScore: StudentScore,
)
data class StudentScore(
    val STU123: Long,
    val STU124: Long,
    val STU125: Long,
)

//3. feladat
data class City(
    val cityName: String,
    val transitSystem: TransitSystem,
    val controlCenter: ControlCenter,
)
data class TransitSystem(
    val buses: List<Bus>,
    val trams: List<Tram>,
)
data class Bus(
    val routeNumber: Long,
    val routeName: String,
    val vehicles: List<Vehicle>,
    val schedule: Schedule,
)
data class Vehicle(
    val vehicleId: String,
    val capacity: Long,
    val currentLocation: CurrentLocation,
    val status: String,

)
data class CurrentLocation(
    val latitude: Double,
    val longtitude: Double,
)
data class Schedule(
    val weekday: List<Weekday>,
    val weekend: List<Weekend>,
)
data class Weekday(
    val departureTime: String,
    val arrivalTime: String,
)
data class Weekend(
    val departureTime: String,
    val arrivalTime: String,
)
data class Tram(
    val routeNumber: Long,
    val routeName: String,
    val vehicles: List<Vehicle>
)
data class ControlCenter(
    val contactNumber: String,
    val emergeyContanct: List<EmergenyContact>,
)
data class EmergenyContact(
    val name: String,
    val phone: String,
    val shift: String,
)