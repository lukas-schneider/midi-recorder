package de.lukasschneider.midifx;

import com.jogamp.opengl.GL2;

import java.awt.*;

class Colors {
  static final Color BLACK = Color.BLACK;
  static final Color WHITE = Color.WHITE;

  static final Color SHADOW = new Color(0, 0, 0, 12);
  static final Color[] TRACK_COLORS_WHITE = {
      new Color(0xC85700),
      new Color(0x005FFF),
  };

  static final Color[] TRACK_COLORS_BLACK = {
      new Color(0x8D3700),
      new Color(0x001FB8),
  };

  static Color getTrackColorWhite(int trackId) {
    if (trackId > 1) return Color.GRAY;
    return TRACK_COLORS_WHITE[trackId];
  }

  static Color getTrackColorBlack(int trackId) {
    if (trackId > 1) return Color.GRAY;
    return TRACK_COLORS_BLACK[trackId];
  }

  static void set(GL2 gl, Color color) {
    gl.glColor4ub((byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue(), (byte) color.getAlpha());
  }
}
