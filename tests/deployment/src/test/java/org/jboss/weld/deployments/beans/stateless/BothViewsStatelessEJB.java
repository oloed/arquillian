package org.jboss.weld.deployments.beans.stateless;

import javax.ejb.Stateless;
import javax.inject.Named;

import org.jboss.weld.deployments.beans.LocalI;
import org.jboss.weld.deployments.beans.RemoteI;

@Stateless
@Named
public class BothViewsStatelessEJB implements LocalI, RemoteI
{
   boolean pinged;

   public void ping()
   {
      pinged = true;
   }

   public boolean isPinged()
   {
      return pinged;
   }

}
