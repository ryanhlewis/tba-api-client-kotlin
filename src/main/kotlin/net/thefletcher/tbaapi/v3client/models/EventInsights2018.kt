/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.04.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.thefletcher.tbaapi.v3client.models


import com.squareup.moshi.Json
/**
 * Insights for FIRST Power Up qualification and elimination matches.
 * @param autoQuestAchieved An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage.
 * @param averageBoostPlayed Average number of boost power up scored (out of 3).
 * @param averageEndgamePoints Average endgame points.
 * @param averageForcePlayed Average number of force power up scored (out of 3).
 * @param averageFoulScore Average foul score.
 * @param averagePointsAuto Average points scored during auto.
 * @param averagePointsTeleop Average points scored during teleop.
 * @param averageRunPointsAuto Average mobility points scored during auto.
 * @param averageScaleOwnershipPoints Average scale ownership points scored.
 * @param averageScaleOwnershipPointsAuto Average scale ownership points scored during auto.
 * @param averageScaleOwnershipPointsTeleop Average scale ownership points scored during teleop.
 * @param averageScore Average score.
 * @param averageSwitchOwnershipPoints Average switch ownership points scored.
 * @param averageSwitchOwnershipPointsAuto Average switch ownership points scored during auto.
 * @param averageSwitchOwnershipPointsTeleop Average switch ownership points scored during teleop.
 * @param averageVaultPoints Average value points scored.
 * @param averageWinMargin Average margin of victory.
 * @param averageWinScore Average winning score.
 * @param boostPlayedCounts An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage.
 * @param climbCounts An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage.
 * @param faceTheBossAchieved An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage.
 * @param forcePlayedCounts An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage.
 * @param highScore An array with three values, high score, match key from the match with the high score, and the name of the match
 * @param levitatePlayedCounts An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage.
 * @param runCountsAuto An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage.
 * @param scaleNeutralPercentage Average scale neutral percentage.
 * @param scaleNeutralPercentageAuto Average scale neutral percentage during auto.
 * @param scaleNeutralPercentageTeleop Average scale neutral percentage during teleop.
 * @param switchOwnedCountsAuto An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage.
 * @param unicornMatches An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage.
 * @param winningOppSwitchDenialPercentageTeleop Average opposing switch denail percentage for the winning alliance during teleop.
 * @param winningOwnSwitchOwnershipPercentage Average own switch ownership percentage for the winning alliance.
 * @param winningOwnSwitchOwnershipPercentageAuto Average own switch ownership percentage for the winning alliance during auto.
 * @param winningOwnSwitchOwnershipPercentageTeleop Average own switch ownership percentage for the winning alliance during teleop.
 * @param winningScaleOwnershipPercentage Average scale ownership percentage for the winning alliance.
 * @param winningScaleOwnershipPercentageAuto Average scale ownership percentage for the winning alliance during auto.
 * @param winningScaleOwnershipPercentageTeleop Average scale ownership percentage for the winning alliance during teleop.
 */
data class EventInsights2018 (
    /* An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage. */
    @Json(name = "auto_quest_achieved")
    val autoQuestAchieved: kotlin.Array<kotlin.Float>,
    /* Average number of boost power up scored (out of 3). */
    @Json(name = "average_boost_played")
    val averageBoostPlayed: kotlin.Float,
    /* Average endgame points. */
    @Json(name = "average_endgame_points")
    val averageEndgamePoints: kotlin.Float,
    /* Average number of force power up scored (out of 3). */
    @Json(name = "average_force_played")
    val averageForcePlayed: kotlin.Float,
    /* Average foul score. */
    @Json(name = "average_foul_score")
    val averageFoulScore: kotlin.Float,
    /* Average points scored during auto. */
    @Json(name = "average_points_auto")
    val averagePointsAuto: kotlin.Float,
    /* Average points scored during teleop. */
    @Json(name = "average_points_teleop")
    val averagePointsTeleop: kotlin.Float,
    /* Average mobility points scored during auto. */
    @Json(name = "average_run_points_auto")
    val averageRunPointsAuto: kotlin.Float,
    /* Average scale ownership points scored. */
    @Json(name = "average_scale_ownership_points")
    val averageScaleOwnershipPoints: kotlin.Float,
    /* Average scale ownership points scored during auto. */
    @Json(name = "average_scale_ownership_points_auto")
    val averageScaleOwnershipPointsAuto: kotlin.Float,
    /* Average scale ownership points scored during teleop. */
    @Json(name = "average_scale_ownership_points_teleop")
    val averageScaleOwnershipPointsTeleop: kotlin.Float,
    /* Average score. */
    @Json(name = "average_score")
    val averageScore: kotlin.Float,
    /* Average switch ownership points scored. */
    @Json(name = "average_switch_ownership_points")
    val averageSwitchOwnershipPoints: kotlin.Float,
    /* Average switch ownership points scored during auto. */
    @Json(name = "average_switch_ownership_points_auto")
    val averageSwitchOwnershipPointsAuto: kotlin.Float,
    /* Average switch ownership points scored during teleop. */
    @Json(name = "average_switch_ownership_points_teleop")
    val averageSwitchOwnershipPointsTeleop: kotlin.Float,
    /* Average value points scored. */
    @Json(name = "average_vault_points")
    val averageVaultPoints: kotlin.Float,
    /* Average margin of victory. */
    @Json(name = "average_win_margin")
    val averageWinMargin: kotlin.Float,
    /* Average winning score. */
    @Json(name = "average_win_score")
    val averageWinScore: kotlin.Float,
    /* An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage. */
    @Json(name = "boost_played_counts")
    val boostPlayedCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage. */
    @Json(name = "climb_counts")
    val climbCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage. */
    @Json(name = "face_the_boss_achieved")
    val faceTheBossAchieved: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage. */
    @Json(name = "force_played_counts")
    val forcePlayedCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, high score, match key from the match with the high score, and the name of the match */
    @Json(name = "high_score")
    val highScore: kotlin.Array<kotlin.String>,
    /* An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage. */
    @Json(name = "levitate_played_counts")
    val levitatePlayedCounts: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage. */
    @Json(name = "run_counts_auto")
    val runCountsAuto: kotlin.Array<kotlin.Float>,
    /* Average scale neutral percentage. */
    @Json(name = "scale_neutral_percentage")
    val scaleNeutralPercentage: kotlin.Float,
    /* Average scale neutral percentage during auto. */
    @Json(name = "scale_neutral_percentage_auto")
    val scaleNeutralPercentageAuto: kotlin.Float,
    /* Average scale neutral percentage during teleop. */
    @Json(name = "scale_neutral_percentage_teleop")
    val scaleNeutralPercentageTeleop: kotlin.Float,
    /* An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage. */
    @Json(name = "switch_owned_counts_auto")
    val switchOwnedCountsAuto: kotlin.Array<kotlin.Float>,
    /* An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage. */
    @Json(name = "unicorn_matches")
    val unicornMatches: kotlin.Array<kotlin.Float>,
    /* Average opposing switch denail percentage for the winning alliance during teleop. */
    @Json(name = "winning_opp_switch_denial_percentage_teleop")
    val winningOppSwitchDenialPercentageTeleop: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance. */
    @Json(name = "winning_own_switch_ownership_percentage")
    val winningOwnSwitchOwnershipPercentage: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance during auto. */
    @Json(name = "winning_own_switch_ownership_percentage_auto")
    val winningOwnSwitchOwnershipPercentageAuto: kotlin.Float,
    /* Average own switch ownership percentage for the winning alliance during teleop. */
    @Json(name = "winning_own_switch_ownership_percentage_teleop")
    val winningOwnSwitchOwnershipPercentageTeleop: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance. */
    @Json(name = "winning_scale_ownership_percentage")
    val winningScaleOwnershipPercentage: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance during auto. */
    @Json(name = "winning_scale_ownership_percentage_auto")
    val winningScaleOwnershipPercentageAuto: kotlin.Float,
    /* Average scale ownership percentage for the winning alliance during teleop. */
    @Json(name = "winning_scale_ownership_percentage_teleop")
    val winningScaleOwnershipPercentageTeleop: kotlin.Float
) {

}

