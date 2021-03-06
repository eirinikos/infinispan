package org.infinispan.objectfilter.test;

import org.infinispan.objectfilter.impl.ReflectionMatcher;

/**
 * @author anistor@redhat.com
 * @since 7.0
 */
public class ReflectionMatcherTest extends AbstractMatcherTest {

   private final FilterQueryFactory queryFactory = new FilterQueryFactory();

   @Override
   protected FilterQueryFactory createQueryFactory() {
      return queryFactory;
   }

   protected ReflectionMatcher createMatcher() {
      return new ReflectionMatcher((ClassLoader) null);
   }
}
