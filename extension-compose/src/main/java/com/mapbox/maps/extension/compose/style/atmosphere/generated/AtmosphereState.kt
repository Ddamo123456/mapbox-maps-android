// This file is generated.

package com.mapbox.maps.extension.compose.style.atmosphere.generated

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.ColorValue
import com.mapbox.maps.extension.compose.style.DoubleRangeValue
import com.mapbox.maps.extension.compose.style.DoubleValue
import com.mapbox.maps.extension.compose.style.Transition
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier
import com.mapbox.maps.extension.compose.style.internal.ValueParceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler
import java.util.Objects

/**
 * Create and [rememberSaveable] a [AtmosphereState] using [AtmosphereState.Saver].
 * [init] will be called when the [AtmosphereState] is first created to configure its
 * initial state.
 *
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param init A function initialise this [AtmosphereState].
 */
@Composable
@MapboxExperimental
public inline fun rememberAtmosphereState(
  key: String? = null,
  crossinline init: AtmosphereState.() -> Unit = {}
): AtmosphereState = rememberSaveable(key = key, saver = AtmosphereState.Saver) {
  AtmosphereState().apply(init)
}

/**
 * A global effect that fades layers and markers based on their distance to the camera. The fog can be used to approximate the effect of atmosphere on distant objects and enhance the depth perception of the map when used with terrain or 3D features. Note: fog is renamed to atmosphere in the Android and iOS SDKs and planned to be changed in GL-JS v.3.0.0.
 *
 * @see [The online documentation](https://docs.mapbox.com/mapbox-gl-js/style-spec/fog/)
 */
@MapboxExperimental
public class AtmosphereState private constructor(
  internal val applier: AtmosphereStateApplier,
  color: ColorValue,
  colorTransition: Transition,
  highColor: ColorValue,
  highColorTransition: Transition,
  horizonBlend: DoubleValue,
  horizonBlendTransition: Transition,
  range: DoubleRangeValue,
  rangeTransition: Transition,
  spaceColor: ColorValue,
  spaceColorTransition: Transition,
  starIntensity: DoubleValue,
  starIntensityTransition: Transition,
  verticalRange: DoubleRangeValue,
  verticalRangeTransition: Transition,
) {

  public constructor() : this(
    AtmosphereStateApplier(emptyMap()),
    ColorValue.INITIAL,
    Transition.INITIAL,
    ColorValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleRangeValue.INITIAL,
    Transition.INITIAL,
    ColorValue.INITIAL,
    Transition.INITIAL,
    DoubleValue.INITIAL,
    Transition.INITIAL,
    DoubleRangeValue.INITIAL,
    Transition.INITIAL,
  )

  private val colorState: MutableState<ColorValue> = mutableStateOf(color)

  /**
   * The color of the atmosphere region immediately below the horizon and within the `range` and above
   * the horizon and within `horizon-blend`. Using opacity is recommended only for smoothly transitioning fog on/off as
   * anything less than 100% opacity results in more tiles loaded and drawn.
   */
  public var color: ColorValue by colorState

  @Composable
  private fun UpdateColor() {
    colorState.value.apply {
      if (notInitial) {
        applier.setProperty("color", value)
      }
    }
  }
  private val colorTransitionState: MutableState<Transition> = mutableStateOf(colorTransition)

  /**
   * The color of the atmosphere region immediately below the horizon and within the `range` and above
   * the horizon and within `horizon-blend`. Using opacity is recommended only for smoothly transitioning fog on/off as
   * anything less than 100% opacity results in more tiles loaded and drawn.
   */
  public var colorTransition: Transition by colorTransitionState

  @Composable
  private fun UpdateColorTransition() {
    colorTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("color", value)
      }
    }
  }
  private val highColorState: MutableState<ColorValue> = mutableStateOf(highColor)

  /**
   * The color of the atmosphere region above the horizon, `high-color` extends further above the horizon than
   * the `color` property and its spread can be controlled with `horizon-blend`. The opacity can be set
   * to `0` to remove the high atmosphere color contribution.
   */
  public var highColor: ColorValue by highColorState

  @Composable
  private fun UpdateHighColor() {
    highColorState.value.apply {
      if (notInitial) {
        applier.setProperty("high-color", value)
      }
    }
  }
  private val highColorTransitionState: MutableState<Transition> = mutableStateOf(highColorTransition)

  /**
   * The color of the atmosphere region above the horizon, `high-color` extends further above the horizon than
   * the `color` property and its spread can be controlled with `horizon-blend`. The opacity can be set
   * to `0` to remove the high atmosphere color contribution.
   */
  public var highColorTransition: Transition by highColorTransitionState

  @Composable
  private fun UpdateHighColorTransition() {
    highColorTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("high-color", value)
      }
    }
  }
  private val horizonBlendState: MutableState<DoubleValue> = mutableStateOf(horizonBlend)

  /**
   * Horizon blend applies a smooth fade from the color of the atmosphere to the color of
   * space. A value of zero leaves a sharp transition from atmosphere to space. Increasing the value
   * blends the color of atmosphere into increasingly high angles of the sky.
   *
   * The minimum accepted value is `0` and the maximum is `1`.
   */
  public var horizonBlend: DoubleValue by horizonBlendState

  @Composable
  private fun UpdateHorizonBlend() {
    horizonBlendState.value.apply {
      if (notInitial) {
        applier.setProperty("horizon-blend", value)
      }
    }
  }
  private val horizonBlendTransitionState: MutableState<Transition> = mutableStateOf(horizonBlendTransition)

  /**
   * Horizon blend applies a smooth fade from the color of the atmosphere to the color of
   * space. A value of zero leaves a sharp transition from atmosphere to space. Increasing the value
   * blends the color of atmosphere into increasingly high angles of the sky.
   *
   * The minimum accepted value is `0` and the maximum is `1`.
   */
  public var horizonBlendTransition: Transition by horizonBlendTransitionState

  @Composable
  private fun UpdateHorizonBlendTransition() {
    horizonBlendTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("horizon-blend", value)
      }
    }
  }
  private val rangeState: MutableState<DoubleRangeValue> = mutableStateOf(range)

  /**
   * The start and end distance range in which fog fades from fully transparent to fully opaque.
   * The distance to the point at the center of the map is defined as zero, so
   * that negative range values are closer to the camera, and positive values are farther away.
   *
   * The minimum accepted value is `-20` and the maximum is `20`.
   */
  public var range: DoubleRangeValue by rangeState

  @Composable
  private fun UpdateRange() {
    rangeState.value.apply {
      if (notInitial) {
        applier.setProperty("range", value)
      }
    }
  }
  private val rangeTransitionState: MutableState<Transition> = mutableStateOf(rangeTransition)

  /**
   * The start and end distance range in which fog fades from fully transparent to fully opaque.
   * The distance to the point at the center of the map is defined as zero, so
   * that negative range values are closer to the camera, and positive values are farther away.
   *
   * The minimum accepted value is `-20` and the maximum is `20`.
   */
  public var rangeTransition: Transition by rangeTransitionState

  @Composable
  private fun UpdateRangeTransition() {
    rangeTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("range", value)
      }
    }
  }
  private val spaceColorState: MutableState<ColorValue> = mutableStateOf(spaceColor)

  /**
   * The color of the region above the horizon and after the end of the `horizon-blend` contribution.
   * The opacity can be set to `0` to have a transparent background.
   */
  public var spaceColor: ColorValue by spaceColorState

  @Composable
  private fun UpdateSpaceColor() {
    spaceColorState.value.apply {
      if (notInitial) {
        applier.setProperty("space-color", value)
      }
    }
  }
  private val spaceColorTransitionState: MutableState<Transition> = mutableStateOf(spaceColorTransition)

  /**
   * The color of the region above the horizon and after the end of the `horizon-blend` contribution.
   * The opacity can be set to `0` to have a transparent background.
   */
  public var spaceColorTransition: Transition by spaceColorTransitionState

  @Composable
  private fun UpdateSpaceColorTransition() {
    spaceColorTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("space-color", value)
      }
    }
  }
  private val starIntensityState: MutableState<DoubleValue> = mutableStateOf(starIntensity)

  /**
   * A value controlling the star intensity where `0` will show no stars and `1` will show
   * stars at their maximum intensity.
   *
   * The minimum accepted value is `0` and the maximum is `1`.
   */
  public var starIntensity: DoubleValue by starIntensityState

  @Composable
  private fun UpdateStarIntensity() {
    starIntensityState.value.apply {
      if (notInitial) {
        applier.setProperty("star-intensity", value)
      }
    }
  }
  private val starIntensityTransitionState: MutableState<Transition> = mutableStateOf(starIntensityTransition)

  /**
   * A value controlling the star intensity where `0` will show no stars and `1` will show
   * stars at their maximum intensity.
   *
   * The minimum accepted value is `0` and the maximum is `1`.
   */
  public var starIntensityTransition: Transition by starIntensityTransitionState

  @Composable
  private fun UpdateStarIntensityTransition() {
    starIntensityTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("star-intensity", value)
      }
    }
  }
  private val verticalRangeState: MutableState<DoubleRangeValue> = mutableStateOf(verticalRange)

  /**
   * An array of two number values, specifying the vertical range, measured in meters, over which the
   * fog should gradually fade out. When both parameters are set to zero, the fog will be
   * rendered without any vertical constraints.
   *
   * The minimum accepted value is `0`
   */
  public var verticalRange: DoubleRangeValue by verticalRangeState

  @Composable
  private fun UpdateVerticalRange() {
    verticalRangeState.value.apply {
      if (notInitial) {
        applier.setProperty("vertical-range", value)
      }
    }
  }
  private val verticalRangeTransitionState: MutableState<Transition> = mutableStateOf(verticalRangeTransition)

  /**
   * An array of two number values, specifying the vertical range, measured in meters, over which the
   * fog should gradually fade out. When both parameters are set to zero, the fog will be
   * rendered without any vertical constraints.
   *
   * The minimum accepted value is `0`
   */
  public var verticalRangeTransition: Transition by verticalRangeTransitionState

  @Composable
  private fun UpdateVerticalRangeTransition() {
    verticalRangeTransitionState.value.apply {
      if (notInitial) {
        applier.setProperty("vertical-range", value)
      }
    }
  }

  @Composable
  internal fun UpdateProperties() {
    UpdateColor()
    UpdateColorTransition()
    UpdateHighColor()
    UpdateHighColorTransition()
    UpdateHorizonBlend()
    UpdateHorizonBlendTransition()
    UpdateRange()
    UpdateRangeTransition()
    UpdateSpaceColor()
    UpdateSpaceColorTransition()
    UpdateStarIntensity()
    UpdateStarIntensityTransition()
    UpdateVerticalRange()
    UpdateVerticalRangeTransition()
  }

  private fun getProperties(): Map<String, Value> =
    listOfNotNull(
      ("color" to color.value).takeIf { color.notInitial },
      ("color" to colorTransition.value).takeIf { colorTransition.notInitial },
      ("high-color" to highColor.value).takeIf { highColor.notInitial },
      ("high-color" to highColorTransition.value).takeIf { highColorTransition.notInitial },
      ("horizon-blend" to horizonBlend.value).takeIf { horizonBlend.notInitial },
      ("horizon-blend" to horizonBlendTransition.value).takeIf { horizonBlendTransition.notInitial },
      ("range" to range.value).takeIf { range.notInitial },
      ("range" to rangeTransition.value).takeIf { rangeTransition.notInitial },
      ("space-color" to spaceColor.value).takeIf { spaceColor.notInitial },
      ("space-color" to spaceColorTransition.value).takeIf { spaceColorTransition.notInitial },
      ("star-intensity" to starIntensity.value).takeIf { starIntensity.notInitial },
      ("star-intensity" to starIntensityTransition.value).takeIf { starIntensityTransition.notInitial },
      ("vertical-range" to verticalRange.value).takeIf { verticalRange.notInitial },
      ("vertical-range" to verticalRangeTransition.value).takeIf { verticalRangeTransition.notInitial },
    ).toMap()

  /**
   * See [Any.equals]
   */
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as AtmosphereState

    if (applier != other.applier) return false
    if (color != other.color) return false
    if (colorTransition != other.colorTransition) return false
    if (highColor != other.highColor) return false
    if (highColorTransition != other.highColorTransition) return false
    if (horizonBlend != other.horizonBlend) return false
    if (horizonBlendTransition != other.horizonBlendTransition) return false
    if (range != other.range) return false
    if (rangeTransition != other.rangeTransition) return false
    if (spaceColor != other.spaceColor) return false
    if (spaceColorTransition != other.spaceColorTransition) return false
    if (starIntensity != other.starIntensity) return false
    if (starIntensityTransition != other.starIntensityTransition) return false
    if (verticalRange != other.verticalRange) return false
    if (verticalRangeTransition != other.verticalRangeTransition) return false

    return true
  }

  /**
   * See [Any.hashCode]
   */
  override fun hashCode(): Int = Objects.hash(
    applier,
    color,
    colorTransition,
    highColor,
    highColorTransition,
    horizonBlend,
    horizonBlendTransition,
    range,
    rangeTransition,
    spaceColor,
    spaceColorTransition,
    starIntensity,
    starIntensityTransition,
    verticalRange,
    verticalRangeTransition,
  )

  /**
   * Returns a string representation of the object.
   */
  override fun toString(): String =
    "AtmosphereState(color=$color, colorTransition=$colorTransition, highColor=$highColor, highColorTransition=$highColorTransition, horizonBlend=$horizonBlend, horizonBlendTransition=$horizonBlendTransition, range=$range, rangeTransition=$rangeTransition, spaceColor=$spaceColor, spaceColorTransition=$spaceColorTransition, starIntensity=$starIntensity, starIntensityTransition=$starIntensityTransition, verticalRange=$verticalRange, verticalRangeTransition=$verticalRangeTransition)"

  /**
   * Atmosphere Holder class to be used within [Saver].
   */
  @MapboxExperimental
  @Parcelize
  @TypeParceler<Value, ValueParceler>
  public data class Holder internal constructor(
    /**
     * Saved properties.
     * Note that we use a generic [Map] to be able to evolve this class without breaking changes.
     */
    val savedProperties: Map<String, Value>,
  ) : Parcelable

  /**
   * Public companion object.
   */
  public companion object {
    /**
     * The default saver implementation for [AtmosphereState]
     */
    public val Saver: Saver<AtmosphereState, Holder> = Saver(
      save = { Holder(it.getProperties()) },
      restore = { holder ->
        AtmosphereState(
          AtmosphereStateApplier(holder.savedProperties),
          color = holder.savedProperties["color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          colorTransition = holder.savedProperties["color"]?.let { Transition(it) } ?: Transition.INITIAL,
          highColor = holder.savedProperties["high-color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          highColorTransition = holder.savedProperties["high-color"]?.let { Transition(it) } ?: Transition.INITIAL,
          horizonBlend = holder.savedProperties["horizon-blend"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          horizonBlendTransition = holder.savedProperties["horizon-blend"]?.let { Transition(it) } ?: Transition.INITIAL,
          range = holder.savedProperties["range"]?.let { DoubleRangeValue(it) } ?: DoubleRangeValue.INITIAL,
          rangeTransition = holder.savedProperties["range"]?.let { Transition(it) } ?: Transition.INITIAL,
          spaceColor = holder.savedProperties["space-color"]?.let { ColorValue(it) } ?: ColorValue.INITIAL,
          spaceColorTransition = holder.savedProperties["space-color"]?.let { Transition(it) } ?: Transition.INITIAL,
          starIntensity = holder.savedProperties["star-intensity"]?.let { DoubleValue(it) } ?: DoubleValue.INITIAL,
          starIntensityTransition = holder.savedProperties["star-intensity"]?.let { Transition(it) } ?: Transition.INITIAL,
          verticalRange = holder.savedProperties["vertical-range"]?.let { DoubleRangeValue(it) } ?: DoubleRangeValue.INITIAL,
          verticalRangeTransition = holder.savedProperties["vertical-range"]?.let { Transition(it) } ?: Transition.INITIAL,
        )
      }
    )
  }
}
// End of generated file.