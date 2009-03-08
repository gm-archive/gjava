package org.antlr.runtime.debug;

import org.antlr.runtime.Token;
import org.antlr.runtime.RecognitionException;

import java.util.List;
import java.util.ArrayList;

/** Broadcast debug events to multiple listeners.  Lets you debug and still
 *  use the event mechanism to build parse trees etc...  Not thread-safe.
 *  Don't add events in one thread while parser fires events in another.
 * 
 *  @see also DebugEventRepeater
 */
public class DebugEventHub implements DebugEventListener {
	protected List listeners = new ArrayList();

    @SuppressWarnings("unchecked")
	public DebugEventHub(DebugEventListener listener) {
		listeners.add(listener);
	}

    @SuppressWarnings("unchecked")
	public DebugEventHub(DebugEventListener a, DebugEventListener b) {
		listeners.add(a);
		listeners.add(b);
	}

	/** Add another listener to broadcast events too.  Not thread-safe.
	 *  Don't add events in one thread while parser fires events in another.
         * 
         * @param listener The listener to add.
         */
    @SuppressWarnings("unchecked")
	public void addListener(DebugEventListener listener) {
		listeners.add(listeners);
	}
	
	/* To avoid a mess like this:
		public void enterRule(final String ruleName) {
			broadcast(new Code(){
				public void exec(DebugEventListener listener) {listener.enterRule(ruleName);}}
				);
		}
		I am dup'ing the for-loop in each.  Where are Java closures!? blech!
	 */

	public void enterRule(String ruleName) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.enterRule(ruleName);
		}
	}

    @Override
	public void exitRule(String ruleName) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.exitRule(ruleName);
		}
	}

    @Override
	public void enterAlt(int alt) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.enterAlt(alt);
		}
	}

    @Override
	public void enterSubRule(int decisionNumber) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.enterSubRule(decisionNumber);
		}
	}

	public void exitSubRule(int decisionNumber) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.exitSubRule(decisionNumber);
		}
	}

    @Override
	public void enterDecision(int decisionNumber) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.enterDecision(decisionNumber);
		}
	}

    @Override
	public void exitDecision(int decisionNumber) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.exitDecision(decisionNumber);
		}
	}

    @Override
	public void location(int line, int pos) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.location(line, pos);
		}
	}

    @Override
	public void consumeToken(Token token) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.consumeToken(token);
		}
	}

    @Override
	public void consumeHiddenToken(Token token) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.consumeHiddenToken(token);
		}
	}

    @Override
	public void LT(int index, Token t) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.LT(index, t);
		}
	}

    @Override
	public void mark(int index) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.mark(index);
		}
	}

    @Override
	public void rewind(int index) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.rewind(index);
		}
	}
    
    @Override
        public void rewind() {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.rewind();
		}
	}

    @Override
	public void beginBacktrack(int level) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.beginBacktrack(level);
		}
	}

    @Override
	public void endBacktrack(int level, boolean successful) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.endBacktrack(level, successful);
		}
	}

    @Override
	public void recognitionException(RecognitionException e) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.recognitionException(e);
		}
	}

    @Override
	public void beginResync() {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.beginResync();
		}
	}

    @Override
	public void endResync() {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.endResync();
		}
	}

    @Override
	public void semanticPredicate(boolean result, String predicate) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.semanticPredicate(result, predicate);
		}
	}

    @Override
	public void commence() {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.commence();
		}
	}

    @Override
	public void terminate() {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.terminate();
		}
	}


	// Tree parsing stuff

    @Override
	public void consumeNode(Object t) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.consumeNode(t);
		}
	}

    @Override
	public void LT(int index, Object t) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.LT(index, t);
		}
	}


	// AST Stuff

    @Override
	public void nilNode(Object t) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.nilNode(t);
		}
	}

    @Override
	public void createNode(Object t) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.createNode(t);
		}
	}

    @Override
	public void createNode(Object node, Token token) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.createNode(node, token);
		}
	}

    @Override
	public void becomeRoot(Object newRoot, Object oldRoot) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.becomeRoot(newRoot, oldRoot);
		}
	}

    @Override
	public void addChild(Object root, Object child) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.addChild(root, child);
		}
	}

    @Override
	public void setTokenBoundaries(Object t, int tokenStartIndex, int tokenStopIndex) {
		for (int i = 0; i < listeners.size(); i++) {
			DebugEventListener listener = (DebugEventListener)listeners.get(i);
			listener.setTokenBoundaries(t, tokenStartIndex, tokenStopIndex);
		}
	}
}
