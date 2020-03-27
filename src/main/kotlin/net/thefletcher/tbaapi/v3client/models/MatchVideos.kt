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


import com.squareup.moshi.Json
/**
 * 
 * @param type Can be one of 'youtube' or 'tba'
 * @param key Unique key representing this video
 */

data class MatchVideos (
    /* Can be one of 'youtube' or 'tba' */
    @Json(name = "type")
    val type: kotlin.String? = null,
    /* Unique key representing this video */
    @Json(name = "key")
    val key: kotlin.String? = null
)

