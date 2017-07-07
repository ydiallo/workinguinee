/**
 * 
 */
package fr.yaya_diallo.workinguinee.mobile;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.jsoup.nodes.Element;

import com.vaadin.server.ClientMethodInvocation;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.Extension;
import com.vaadin.server.Resource;
import com.vaadin.server.ServerRpcManager;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinResponse;
import com.vaadin.shared.Registration;
import com.vaadin.shared.communication.SharedState;
import com.vaadin.ui.Component;
import com.vaadin.ui.HasComponents;
import com.vaadin.ui.UI;
import com.vaadin.ui.declarative.DesignContext;

import elemental.json.JsonObject;

/**
 * @author pg8pf
 *
 */
public class SearchView implements Component {

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#addAttachListener(com.vaadin.server.ClientConnector.AttachListener)
	 */
	@Override
	public Registration addAttachListener(AttachListener listener) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#removeAttachListener(com.vaadin.server.ClientConnector.AttachListener)
	 */
	@Override
	public void removeAttachListener(AttachListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#addDetachListener(com.vaadin.server.ClientConnector.DetachListener)
	 */
	@Override
	public Registration addDetachListener(DetachListener listener) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#removeDetachListener(com.vaadin.server.ClientConnector.DetachListener)
	 */
	@Override
	public void removeDetachListener(DetachListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#retrievePendingRpcCalls()
	 */
	@Override
	public List<ClientMethodInvocation> retrievePendingRpcCalls() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#isConnectorEnabled()
	 */
	@Override
	public boolean isConnectorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#getStateType()
	 */
	@Override
	public Class<? extends SharedState> getStateType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#requestRepaint()
	 */
	@Override
	public void requestRepaint() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#markAsDirty()
	 */
	@Override
	public void markAsDirty() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#requestRepaintAll()
	 */
	@Override
	public void requestRepaintAll() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#markAsDirtyRecursive()
	 */
	@Override
	public void markAsDirtyRecursive() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#isAttached()
	 */
	@Override
	public boolean isAttached() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#detach()
	 */
	@Override
	public void detach() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#getExtensions()
	 */
	@Override
	public Collection<Extension> getExtensions() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#removeExtension(com.vaadin.server.Extension)
	 */
	@Override
	public void removeExtension(Extension extension) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#beforeClientResponse(boolean)
	 */
	@Override
	public void beforeClientResponse(boolean initial) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#encodeState()
	 */
	@Override
	public JsonObject encodeState() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#handleConnectorRequest(com.vaadin.server.VaadinRequest, com.vaadin.server.VaadinResponse, java.lang.String)
	 */
	@Override
	public boolean handleConnectorRequest(VaadinRequest request, VaadinResponse response, String path)
			throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#getRpcManager(java.lang.String)
	 */
	@Override
	public ServerRpcManager<?> getRpcManager(String rpcInterfaceName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#getErrorHandler()
	 */
	@Override
	public ErrorHandler getErrorHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.ClientConnector#setErrorHandler(com.vaadin.server.ErrorHandler)
	 */
	@Override
	public void setErrorHandler(ErrorHandler errorHandler) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.shared.Connector#getConnectorId()
	 */
	@Override
	public String getConnectorId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#getWidth()
	 */
	@Override
	public float getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#getHeight()
	 */
	@Override
	public float getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#getWidthUnits()
	 */
	@Override
	public Unit getWidthUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#getHeightUnits()
	 */
	@Override
	public Unit getHeightUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setHeight(java.lang.String)
	 */
	@Override
	public void setHeight(String height) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setWidth(float, com.vaadin.server.Sizeable.Unit)
	 */
	@Override
	public void setWidth(float width, Unit unit) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setHeight(float, com.vaadin.server.Sizeable.Unit)
	 */
	@Override
	public void setHeight(float height, Unit unit) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setWidth(java.lang.String)
	 */
	@Override
	public void setWidth(String width) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setSizeFull()
	 */
	@Override
	public void setSizeFull() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setSizeUndefined()
	 */
	@Override
	public void setSizeUndefined() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setWidthUndefined()
	 */
	@Override
	public void setWidthUndefined() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.server.Sizeable#setHeightUndefined()
	 */
	@Override
	public void setHeightUndefined() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getStyleName()
	 */
	@Override
	public String getStyleName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setStyleName(java.lang.String)
	 */
	@Override
	public void setStyleName(String style) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#addStyleName(java.lang.String)
	 */
	@Override
	public void addStyleName(String style) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#removeStyleName(java.lang.String)
	 */
	@Override
	public void removeStyleName(String style) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getPrimaryStyleName()
	 */
	@Override
	public String getPrimaryStyleName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setPrimaryStyleName(java.lang.String)
	 */
	@Override
	public void setPrimaryStyleName(String style) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#isVisible()
	 */
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setParent(com.vaadin.ui.HasComponents)
	 */
	@Override
	public void setParent(HasComponents parent) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getParent()
	 */
	@Override
	public HasComponents getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getCaption()
	 */
	@Override
	public String getCaption() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setCaption(java.lang.String)
	 */
	@Override
	public void setCaption(String caption) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getIcon()
	 */
	@Override
	public Resource getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setIcon(com.vaadin.server.Resource)
	 */
	@Override
	public void setIcon(Resource icon) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getUI()
	 */
	@Override
	public UI getUI() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#attach()
	 */
	@Override
	public void attach() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getLocale()
	 */
	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getId()
	 */
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#readDesign(org.jsoup.nodes.Element, com.vaadin.ui.declarative.DesignContext)
	 */
	@Override
	public void readDesign(Element design, DesignContext designContext) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#writeDesign(org.jsoup.nodes.Element, com.vaadin.ui.declarative.DesignContext)
	 */
	@Override
	public void writeDesign(Element design, DesignContext designContext) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#addListener(com.vaadin.ui.Component.Listener)
	 */
	@Override
	public Registration addListener(Listener listener) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Component#removeListener(com.vaadin.ui.Component.Listener)
	 */
	@Override
	public void removeListener(Listener listener) {
		// TODO Auto-generated method stub

	}

}
