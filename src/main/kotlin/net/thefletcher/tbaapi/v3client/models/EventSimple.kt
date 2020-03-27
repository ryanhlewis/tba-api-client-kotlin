/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.8.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models

import net.thefletcher.tbaapi.v3client.models.DistrictList

import com.squareup.moshi.Json
/**
 * 
 * @param key TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
 * @param name Official name of event on record either provided by FIRST or organizers of offseason event.
 * @param eventCode Event short code, as provided by FIRST.
 * @param eventType Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2
 * @param startDate Event start date in `yyyy-mm-dd` format.
 * @param endDate Event end date in `yyyy-mm-dd` format.
 * @param year Year the event data is for.
 * @param district 
 * @param city City, town, village, etc. the event is located in.
 * @param stateProv State or Province the event is located in.
 * @param country Country the event is located in.
 */

data class EventSimple (
    /* TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. */
    @Json(name = "key")
    val key: kotlin.String,
    /* Official name of event on record either provided by FIRST or organizers of offseason event. */
    @Json(name = "name")
    val name: kotlin.String,
    /* Event short code, as provided by FIRST. */
    @Json(name = "event_code")
    val eventCode: kotlin.String,
    /* Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 */
    @Json(name = "event_type")
    val eventType: kotlin.Int,
    /* Event start date in `yyyy-mm-dd` format. */
    @Json(name = "start_date")
    val startDate: java.time.LocalDate,
    /* Event end date in `yyyy-mm-dd` format. */
    @Json(name = "end_date")
    val endDate: java.time.LocalDate,
    /* Year the event data is for. */
    @Json(name = "year")
    val year: kotlin.Int,
    @Json(name = "district")
    val district: DistrictList? = null,
    /* City, town, village, etc. the event is located in. */
    @Json(name = "city")
    val city: kotlin.String? = null,
    /* State or Province the event is located in. */
    @Json(name = "state_prov")
    val stateProv: kotlin.String? = null,
    /* Country the event is located in. */
    @Json(name = "country")
    val country: kotlin.String? = null
)

