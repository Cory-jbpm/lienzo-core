package com.ait.lienzo.client.core.shape.wires.handlers;

import com.ait.lienzo.client.core.shape.wires.PickerPart;
import com.ait.lienzo.client.core.shape.wires.WiresConnector;
import com.ait.lienzo.client.core.shape.wires.WiresManager;
import com.ait.lienzo.client.core.shape.wires.handlers.impl.WiresShapeHandler;

/**
 * Factory to create wire shapes and connectors handlers.
 * This may be implemented to create custom handlers if necessary to override the default implementation.
 */
public interface WiresHandlerFactory {

    WiresConnectorHandler newConnectorHandler(WiresConnector connector, WiresManager wiresManager);

    WiresControlPointHandler newControlPointHandler(WiresConnector connector, WiresConnectorControl connectorControl);

    WiresShapeHandler newShapeHandler(WiresShapeControl control, WiresShapeHighlight<PickerPart.ShapePart> highlight, WiresManager manager);
}