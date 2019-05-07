/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* OpenAPI spec version: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


import com.squareup.moshi.Json
/**
 * 
 * @param key TBA team key with the format `frcXXXX` with `XXXX` representing the team number.
 * @param teamNumber Official team number issued by FIRST.
 * @param nickname Team nickname provided by FIRST.
 * @param name Official long name registered with FIRST.
 * @param city City of team derived from parsing the address registered with FIRST.
 * @param stateProv State of team derived from parsing the address registered with FIRST.
 * @param country Country of team derived from parsing the address registered with FIRST.
 * @param address Will be NULL, for future development.
 * @param postalCode Postal code from the team address.
 * @param gmapsPlaceId Will be NULL, for future development.
 * @param gmapsUrl Will be NULL, for future development.
 * @param lat Will be NULL, for future development.
 * @param lng Will be NULL, for future development.
 * @param locationName Will be NULL, for future development.
 * @param website Official website associated with the team.
 * @param rookieYear First year the team officially competed.
 * @param motto Team's motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019.
 * @param homeChampionship Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value.
 */
data class Team (
    /* TBA team key with the format `frcXXXX` with `XXXX` representing the team number. */
    @Json(name = "key")
    val key: kotlin.String,
    /* Official team number issued by FIRST. */
    @Json(name = "team_number")
    val teamNumber: kotlin.Int,
    /* Official long name registered with FIRST. */
    @Json(name = "name")
    val name: kotlin.String,
    /* First year the team officially competed. */
    @Json(name = "rookie_year")
    val rookieYear: kotlin.Int,
    /* Team nickname provided by FIRST. */
    @Json(name = "nickname")
    val nickname: kotlin.String? = null,
    /* City of team derived from parsing the address registered with FIRST. */
    @Json(name = "city")
    val city: kotlin.String? = null,
    /* State of team derived from parsing the address registered with FIRST. */
    @Json(name = "state_prov")
    val stateProv: kotlin.String? = null,
    /* Country of team derived from parsing the address registered with FIRST. */
    @Json(name = "country")
    val country: kotlin.String? = null,
    /* Will be NULL, for future development. */
    @Json(name = "address")
    val address: kotlin.String? = null,
    /* Postal code from the team address. */
    @Json(name = "postal_code")
    val postalCode: kotlin.String? = null,
    /* Will be NULL, for future development. */
    @Json(name = "gmaps_place_id")
    val gmapsPlaceId: kotlin.String? = null,
    /* Will be NULL, for future development. */
    @Json(name = "gmaps_url")
    val gmapsUrl: kotlin.String? = null,
    /* Will be NULL, for future development. */
    @Json(name = "lat")
    val lat: kotlin.Double? = null,
    /* Will be NULL, for future development. */
    @Json(name = "lng")
    val lng: kotlin.Double? = null,
    /* Will be NULL, for future development. */
    @Json(name = "location_name")
    val locationName: kotlin.String? = null,
    /* Official website associated with the team. */
    @Json(name = "website")
    val website: kotlin.String? = null,
    /* Team's motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019. */
    @Json(name = "motto")
    val motto: kotlin.String? = null,
    /* Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value. */
    @Json(name = "home_championship")
    val homeChampionship: kotlin.Any? = null
) {

}

